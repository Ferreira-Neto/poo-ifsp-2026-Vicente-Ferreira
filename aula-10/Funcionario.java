public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {

        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }

    public double calcularBonus() {
        return salario * 0.10;
    }

@Override
public String toString() {
        return nome + " (" + cpf + ") - R$ " + salario;
}


}
