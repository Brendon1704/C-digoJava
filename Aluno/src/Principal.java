public class Principal {
    public static void main(String[] args) {

        // Criando uma disciplina
        Disciplina disciplina = new Disciplina("Matemática", 60);

        // Instanciando um objeto da classe Aluno
        Aluno aluno1 = new Aluno("Brendon", 555, 10, 10, 8, 10, 9, disciplina);

        // Imprimindo informações do aluno
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Matrícula: " + aluno1.matricula);
        System.out.println("Nota Matemática: " + aluno1.nota_mat);
        System.out.println("Nota Português: " + aluno1.nota_por);
        System.out.println("Nota Física: " + aluno1.nota_fis);
        System.out.println("Nota Geografia: " + aluno1.nota_geo);
        System.out.println("Nota Química: " + aluno1.nota_quim);
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.situacaoAluno());
        System.out.println();
        System.out.println("Disciplina: " + aluno1.disciplina.nome);
        System.out.println("Carga horária: " + aluno1.disciplina.cargaHoraria);

    }
}