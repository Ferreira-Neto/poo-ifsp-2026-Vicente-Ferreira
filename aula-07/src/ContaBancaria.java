public class ContaBancaria {


    private String titular;
    private double saldo;
    private boolean ativa;

    // Construtor completo
    public ContaBancaria(String titular, double saldo, boolean ativa) {

        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;

    }

    // Construtor que abre a conta com saldo 0 e já ativa
    public ContaBancaria(String titular) {
        this(titular, 0, true);


    }

    public String getTitular() {
        return titular;

    }

    public double getSaldo() {
        return saldo;

    }

    // Getter booleano: observe o prefixo "is" em vez de "get"
    public boolean isAtiva() {

        return ativa;

    }

    public void depositar(double valor) {

        if (this.ativa && valor > 0) {
            this.saldo += valor;
        }

    }

}

