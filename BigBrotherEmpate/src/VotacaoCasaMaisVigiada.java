import java.util.ArrayList;
import java.util.Scanner;

public class VotacaoCasaMaisVigiada {

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = cadastrarJogadores();

        votacao(jogadores);

        apuracaoFinal(jogadores);
    }

    public static ArrayList<Jogador> cadastrarJogadores() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));
        return jogadores;
    }

    public static void votacao(ArrayList<Jogador> jogadores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inicio das votações. Digite o nome dos 3 participantes que você quer eliminar separados por vírgula ou 'sair' para encerrar:");
        String votos = scanner.nextLine();

        while (!votos.equalsIgnoreCase("sair")) {
            String[] votosSeparados = votos.split(",");
            if (votosSeparados.length != 3) {
                System.out.println("Por favor, digite exatamente 3 participantes separados por vírgula ou 'sair' para encerrar:");
            } else {
                boolean todosEncontrados = true;
                for (String voto : votosSeparados) {
                    boolean encontrado = false;
                    for (Jogador jogador : jogadores) {
                        if (jogador.getNome().equalsIgnoreCase(voto.trim())) {
                            jogador.incrementaUmVoto();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Participante " + voto + " não encontrado.");
                        todosEncontrados = false;
                        break;
                    }
                }
                if (todosEncontrados) {
                    break; // Sair do loop se todos os votos forem válidos
                }
            }
            votos = scanner.nextLine();
        }
        scanner.close();
    }

    public static void apuracaoFinal(ArrayList<Jogador> jogadores) {
        ArrayList<Jogador> eliminados = new ArrayList<>();
        int maxVotos = 0;

        // Encontrar o máximo número de votos
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > maxVotos) {
                maxVotos = jogador.getVotos();
            }
        }

        // Encontrar todos os jogadores com o máximo número de votos
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() == maxVotos) {
                eliminados.add(jogador);
            }
        }

        // Verificar se houve empate
        if (eliminados.size() == 1) {
            Jogador eliminado = eliminados.get(0);
            System.out.println("Com " + eliminado.getVotos() + " votos, o participante eliminado é: " + eliminado.getNome());
        } else {
            System.out.println("Houve um empate entre os seguintes participantes:");
            for (Jogador empate : eliminados) {
                System.out.println(empate.getNome() + " com " + empate.getVotos() + " votos.");
            }
        }
    }
}
