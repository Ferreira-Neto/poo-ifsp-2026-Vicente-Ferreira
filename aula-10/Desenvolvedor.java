public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario,
                         String linguagemPrincipal) {

        super( nome, cpf, salario );
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String

    public double calcularBonus() {
        return salario * 0.10;
    }
}