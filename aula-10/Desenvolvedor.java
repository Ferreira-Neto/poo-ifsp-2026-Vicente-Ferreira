public class Desenvolvedor {


    private String nome;
    private String cpf;
    private double salario;
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario,
                         String linguagemPrincipal) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }
    public String getLinguagemPrincipal() { return linguagemPrincipal; }

    public double calcularBonus() {
        return salario * 0.10;
    }
}