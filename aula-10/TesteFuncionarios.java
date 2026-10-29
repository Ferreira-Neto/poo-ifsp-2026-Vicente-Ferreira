public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "111.111.111-11", 8000.0, 5);
        Desenvolvedor d = new Desenvolvedor("Bruno", "222.222.222-22", 6000.0, "Java");

        System.out.println(g.getNome() + " - bônus: " + g.calcularBonus());
        System.out.println(d.getNome() + " - bônus: " + d.calcularBonus());
        System.out.println(g);
    }
}