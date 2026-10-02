public class SomaDiagonalMatriz {

        public static void main ( String[] args )   {

            int[][] matriz = {  {1,2,3},
                                {4,5,6},
                                {7,8,9} };      /*/{00, 01, 02}
                                                    10, 11, 12
                                                    20, 21, 22}/*/

            int somaDiagonal = 0;

            for ( int i = 0; i < matriz.length; i++ )   {
                somaDiagonal += matriz[i][i];

               /*/ for ( int j = 0; j < matriz[i].length; j++ )    {
               if ( i == j )   {
               somaDiagonal += matriz[i][j];
                 }/*/

                }

            System.out.println("Soma da diagonal principal: " + somaDiagonal);

        }

        }

