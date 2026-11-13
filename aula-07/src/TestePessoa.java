public class TestePessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 20);
        System.out.println("p1: " + p1.getNome() + ", " + p1.getIdade());

        Pessoa p2 = new Pessoa(p1);
        p2.setNome("Maria");
        p2.setIdade(30);

        System.out.println("p2: " + p2.getNome() + ", " + p2.getIdade());
    }
}
