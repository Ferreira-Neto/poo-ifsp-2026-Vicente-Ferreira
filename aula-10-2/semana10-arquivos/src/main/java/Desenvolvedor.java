public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor( String nome, String cpf, double salario, String linguagemPrincipal ) {

        super( nome, cpf, salario );
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() { return linguagemPrincipal; }

    @Override
    public String toString() {
        return super.toString() + " - linguagem " + linguagemPrincipal;
    }

}