public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void info(){
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salario: " +salario);        
    }
}
   

