public class TesteRetangulo {

    public static void main ( String[] args )   {

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo( 4 );
        Retangulo r3 = new Retangulo( 5, 3 );

        System.out.println( "Area r1: " + r1.calcularArea() );
        System.out.println( "Area r2: " + r2.calcularArea() );
        System.out.println( "Area r3: " + r3.calcularArea() );

    }

}
