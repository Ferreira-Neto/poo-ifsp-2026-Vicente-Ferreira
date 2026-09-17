public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        //todo: retorne o valor do atributo nome

        return nome;

    }

    public void setNome(String n) {
        //todo: atribua o parametro ao atributo nome

        nome = n;



    }

    public double getPreco()  {

        //todo: retorne o valor do atributo preco

        return preco;
    }

    public void setPreco(double p) {
        //todo: só atualize o atributo se preco for maior ou igual a 0

        if ( p >= 0 )
        {   preco = p ; }

    }



}