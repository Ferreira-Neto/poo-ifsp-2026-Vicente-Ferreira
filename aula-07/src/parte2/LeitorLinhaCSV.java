package parte2;

public class LeitorLinhaCSV {
    public static void main(String[] args) {

        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

// TODO 1: use split(",") para separar "linha" em um array de Strings
//
        String[] linhaDiv = linha.split(",");

// TODO 2: imprima cada posição do array separadamente

        System.out.println("Posição 1: " + linhaDiv[0]);
        System.out.println("Posição 2: " + linhaDiv[1] );
        System.out.println("Posição 3: " + linhaDiv[2] );

// TODO 3: compare linha.equals(outraLinha) e depois//
//        //linha.equalsIgnoreCase(outraLinha), imprimindo os dois resultados

        System.out.println( linha.equals(outraLinha) /*linha == outraLinha*/ );
        System.out.println( linha.equalsIgnoreCase(outraLinha) );


// TODO 4: usando String.format, monte e imprima a frase://"Nome: Maria | Idade: 28 anos | Status: ATIVO"
//
        String frase = String.format("Nome: %s | Idade: %s anos | Status: %s", linhaDiv[0], linhaDiv[1], linhaDiv[2]);
        System.out.print(frase);


    }
}