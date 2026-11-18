package parte2;

import java.util.ArrayList;

public class ListaDeCompras {

    private ArrayList<Produto> produtos = new ArrayList<>();

    // TODO: adicione produto na lista "produtos"
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    // TODO: percorra "produtos" com um for-each somando o preço de cada um
    public double calcularTotal() {
        double total = 0;
        for ( Produto p : produtos )    {
            total += p.getPreco();
        }
        return total;
    }

    // TODO: percorra "produtos" imprimindo nome e preço de cada Produto
    public void imprimirTodos() {
        for ( Produto p : produtos )    {
            System.out.println( p.getNome() + ":  R$ " + p.getPreco() );
        }

    }
}
