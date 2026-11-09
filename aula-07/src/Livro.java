public class Livro {

    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {

        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Livro() { this.titulo = "Sem titulo"; this.paginas = 0; }

    public String getTitulo()   { return titulo; }
    public int getPaginas() { return paginas; }

}