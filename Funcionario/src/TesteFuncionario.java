public class TesteFuncionario {
    public static void main(String[] args) {
        // Funcionário regular
        FuncionarioRegular regular = new FuncionarioRegular("João", 20.0, 160);
        System.out.println("Detalhes do funcionário regular:");
        System.out.println("Nome: " + regular.getNome());
        System.out.println("Salário mensal: " + regular.calcularSalarioMensal());

        // Funcionário terceirizado
        FuncionarioTerceirizado terceirizado = new FuncionarioTerceirizado("Maria", 18.0, 160, 500.0);
        System.out.println("\nDetalhes do funcionário terceirizado:");
        System.out.println("Nome: " + terceirizado.getNome());
        System.out.println("Salário mensal: " + terceirizado.calcularSalarioMensal());
    }
}