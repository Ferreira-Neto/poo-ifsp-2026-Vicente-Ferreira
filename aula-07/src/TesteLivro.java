public class TesteLivro {

    public static void main ( String[] args )   {

        Livro l = new Livro();
        Livro l1 = new Livro("Dom Casmurro",256);

        System.out.println("Titulo: " + l.getTitulo() + ", Paginas: " + l.getPaginas() );
        System.out.println("Titulo: " + l1.getTitulo() + ", Paginas: " + l1.getPaginas() );


    }

}
