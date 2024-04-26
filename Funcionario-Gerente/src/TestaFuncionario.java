public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario ("Brendon",29,4000);

        Gerente gerente = new Gerente ("Andrey",40,15.000,"TI");

        System.out.println("Informação do Funcionario:");
        
        funcionario.info();

        System.out.println("Informação do Gerente:");
        
        gerente.info();
    }

}
