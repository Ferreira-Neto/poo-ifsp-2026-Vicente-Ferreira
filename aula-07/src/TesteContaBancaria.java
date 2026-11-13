public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Ana");
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(100);
        System.out.println("Apos depositar 100: " + conta.getSaldo());

        conta.depositar(50);
        System.out.println("Apos depositar 50: " + conta.getSaldo());

        conta.depositar(-30);
        System.out.println("Apos depositar -30 (invalido): " + conta.getSaldo());
    }
}
