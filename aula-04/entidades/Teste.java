package aula04.entidades;

public class Teste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        //p1.nome = "Ricardo";
        String nome = "Ricardo";
        p1.altereSeuNomePara(nome);

        //p1.idade = "-30";

        p1.alterarIdade(-30);

    }

}
