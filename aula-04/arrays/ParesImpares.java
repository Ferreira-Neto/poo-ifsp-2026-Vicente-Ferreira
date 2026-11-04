public class ParesImpares {

    public static void main(String[] args) {

        int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14};

        int qtspares = 0;
        int qtsimpares = 0;

        System.out.print("Entrada: ");
        for ( int i = 0; i < arrayOriginal.length; i++ ) {

            System.out.print(arrayOriginal[i] + ",");
        }

        System.out.println();

        for ( int i = 0; i < arrayOriginal.length; i++ ) {
            if ( arrayOriginal[i] % 2 == 0 ) {
                qtspares++;
            } else {
                qtsimpares++;
            }
        }

        int[] pares = new int[qtspares];
        int[] impares = new int[qtsimpares];

        int ValoresPares = 0;
        int ValoresImpares = 0;

        for ( int i = 0; i < arrayOriginal.length; i++ ) {

            if ( arrayOriginal[i] % 2 == 0 ) {

                pares[ValoresPares] = arrayOriginal[i];
                ValoresPares++;
            } else {
                impares[ValoresImpares] = arrayOriginal[i];
                ValoresImpares++;
            }

        }
        System.out.print("Pares: ");
        for ( int i = 0; i < pares.length; i++ )  {
            System.out.print(pares[i]+",");
    }
        System.out.println();

        System.out.print("Impares: ");
        for ( int i = 0; i < impares.length; i++ )  {
            System.out.print(impares[i]+",");
        }

    }
       }



