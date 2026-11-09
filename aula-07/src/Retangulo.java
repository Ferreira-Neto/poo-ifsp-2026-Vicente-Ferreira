public class Retangulo {

    private double base;
    private double altura;

    // Construtor 1: sem parâmetros-> base = 1 e altura = 1

    public Retangulo() {
        this.base = 1;
        this.altura = 1;

    }

    // Construtor 2: recebe apenas o lado-> quadrado (base = altura = lado)

    public Retangulo(double lado) {
    this.base = lado;
    this.altura = lado;

    }

    // Construtor 3: recebe base e altura distintas

    public Retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;


    }

    public double calcularArea() {
        return base * altura;
    }
}