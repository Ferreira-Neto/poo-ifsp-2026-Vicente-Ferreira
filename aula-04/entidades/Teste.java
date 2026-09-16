package aula04.entidades;

public class Teste {
    public static void main(String [] args){
        Pessoa p1 = new Pessoa();
        //p1.nome = "Ricardo";
        String nome = "ricardo pessoa";
        p1.altereSeuNomePara(nome);
        p1.alterarIdade(30);



        System.out.println(p1.qualSeuNome());
        System.out.println(p1.qualSuaIdade());
        System.out.println(p1.qualUltimoNome());
    }
}
