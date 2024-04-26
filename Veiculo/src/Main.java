public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Toyota ", "Corolla ", 2030);

        Carro carro = new Carro("Honda ", "Civic ", 2005, 2);

        Moto moto = new Moto("Yamaha ", "Fazer ", 2011, false);

        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);
    }
}