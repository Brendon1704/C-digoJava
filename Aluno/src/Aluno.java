import  java.lang.reflect.Constructor;
public class Aluno {
    // Atributos

    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    Disciplina disciplina;

    // Construtor
    public Aluno(String nome, int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo, double nota_quim, Disciplina disciplina){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
        this.disciplina = disciplina;
    }

    // Método para calcular a média das notas do aluno
    public double calcularMedia() {
        return (nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5;
    }

    // Método para verificar a situação do aluno
    public String situacaoAluno() {

        double media = calcularMedia();

        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}