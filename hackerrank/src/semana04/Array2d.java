package semana04;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 6; coluna++) {
                arr[linha][coluna] = scan.nextInt();
            }
        }
        scan.close();

        int maiorSoma = Integer.MIN_VALUE;


        for (int linha = 0; linha <= 3; linha++) {
            for (int coluna = 0; coluna <= 3; coluna++) {

                int somaAtual = arr[linha][coluna]     + arr[linha][coluna + 1]     + arr[linha][coluna + 2]
                        + arr[linha + 1][coluna + 1]
                        + arr[linha + 2][coluna] + arr[linha + 2][coluna + 1] + arr[linha + 2][coluna + 2];

                if (somaAtual > maiorSoma) {
                    maiorSoma = somaAtual;
                }
            }
        }

        System.out.println(maiorSoma);
    }
}