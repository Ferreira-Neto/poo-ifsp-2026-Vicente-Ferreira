public class Inverte {
    public static void main ( String[] args ) {

        int[] arrayInt = {10, 20, 30, 40, 50};

        System.out.print("Entrada: ");
        for (int i = 0; i < arrayInt.length; i++) {

            System.out.print(+ arrayInt[i] +"," );
        }

        System.out.println();

        System.out.print("Saída: ");
        for (int i = arrayInt.length - 1; i >= 0; i--) {


            System.out.print( arrayInt[i] +"," );
        }

    }
}
