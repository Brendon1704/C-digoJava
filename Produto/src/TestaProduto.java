public class TestaProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto(" Camiseta ", 29.90, 50);

        Produto produto2 = new Produto( " Calca Jeans ", 79.60, 40);

        System.out.println(" Detalhes do produto 1: ");
        System.out.println(produto1);

        System.out.println(" \nDetalhes do produto 2: ");
        System.out.println(produto2);

        // Adicionar estoque ao produto 1
        produto1.adicionarEstoque(20);
        System.out.println(" \nApos adicionar estoque ao produto 1: ");
        System.out.println(produto1);

        // Remover estoque do produto 2
        produto2.removerEstoque(15);
        System.out.println(" \nApos remover estoque do produto 2: ");
        System.out.println(produto2);
    }
}