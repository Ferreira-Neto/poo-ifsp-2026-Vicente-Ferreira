public class Calculadora {

    public int somar(int a, int b) {

        return a + b;
    }

    public int somar(int a, int b, int c) {

        return a + b + c;
    }

    public double somar(double a, double b) {

        return a + b;
    }

    // Atividade 9: varargs
    public int somar(int... numeros) {

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }
}
