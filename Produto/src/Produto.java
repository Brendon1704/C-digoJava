class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEmEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEmEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println(" Quantidade insuficiente em estoque. ");
        }
    }


    public String toString() {
        return " Produto [nome = " + nome + ", precoUnitario = " + precoUnitario + ", quantidadeEmEstoque = "
                + quantidadeEmEstoque + " ] ";
    }
}


