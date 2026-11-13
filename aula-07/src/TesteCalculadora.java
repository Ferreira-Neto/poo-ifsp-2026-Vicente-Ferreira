public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("soma(a = 1, b = 2) = " + calc.somar(1, 2));
        System.out.println("soma(a = 1, b = 2, c = 3) = " + calc.somar(1, 2, 3));
        System.out.println("soma(a double = 1,5, b double = 2,5 ) = " + calc.somar(1.5, 2.5));


        System.out.println("somar() = " + calc.somar());
        System.out.println("somar(5) = " + calc.somar(5));
        System.out.println("somar(1,2,3,4) = " + calc.somar(1, 2, 3, 4));
        System.out.println("somar(1,2,3,4,5,6) = " + calc.somar(1, 2, 3, 4, 5, 6));

        System.out.println("qual versao roda em somar(3, 4)? ");
        System.out.println("somar(3, 4) = " + calc.somar(3, 4));



    }
}
