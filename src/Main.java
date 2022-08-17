import lojaPackage.Carrinho;
import lojaPackage.Produto;

public class Main {
    public static void main(String[] args) {


        Carrinho carrinho = new Carrinho();
        carrinho.adicionarAoCarrinho(new Produto("Agua Tonica", 2.50));

        carrinho.mostrarCarrinho();
        carrinho.finalizarCompra();
        carrinho.mostrarCarrinho();
    }
}