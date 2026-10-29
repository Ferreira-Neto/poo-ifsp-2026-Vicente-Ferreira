public class Gerente extends Funcionario {

    private int numeroFuncionarios;

    public Gerente( String nome, String cpf, double salario, int numeroFuncionarios )   {

        super(nome, cpf, salario);
        this.numeroFuncionarios = numeroFuncionarios;

    }
    public int getNumeroFuncionarios() { return numeroFuncionarios; }

@Override
public double calcularBonus()   {
        return super.calcularBonus() * 2 + 100.0 * numeroFuncionarios;
}

@Override
    public String toString()    {
    return super.toString() + " - gerencia " +numeroFuncionarios;
}


}