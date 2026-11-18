package parte2;

import java.util.Locale;

public class ValidadorCadastro {

    public static void main ( String[] args )   {

     String nomeDigitado = " Maria ";

     String nomeCorrigido = nomeDigitado.trim();

     if ( nomeCorrigido.isEmpty() ) {
         System.out.println("Nome invalido");
     }  else {
         System.out.println( nomeCorrigido.toUpperCase() );
         System.out.println( nomeCorrigido.length() );
         //System.out.println( nomeDigitado );
     }

    }

}
