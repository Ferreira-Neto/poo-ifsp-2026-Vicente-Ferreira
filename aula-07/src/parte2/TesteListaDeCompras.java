package parte2;

public class TesteListaDeCompras {

    public static void main ( String[] args )   {

        ListaDeCompras lista = new ListaDeCompras();

        lista.adicionar( new Produto("Mouse", 50.90) );
        lista.adicionar( new Produto( "Teclado", 80.90 ) );
        lista.adicionar( new Produto ( "Mousepad", 20.90 ) );

        lista.imprimirTodos();
        System.out.println("Total: " + lista.calcularTotal() );

    }

}
