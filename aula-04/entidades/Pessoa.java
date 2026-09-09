package aula04.entidades;

public class Pessoa {

    private String nome;
    private int idade;
    private String ultimoNome;

    private void dividirString(String texto) {
        String[]

    }
    public void altereSeuNomePara(String novoNome) {

        if (novoNome == null || novoNome.isBlank()) {

            //System.err.println("Campo novoNome vazio ou nulo");
            //return;

            throw new IllegalArgumentException("Campo novoNome vazio ou nulo");

        }

        nome = novoNome;

        public void alterarIdade(int i) {

            if ( i >= 0 && i <= 120 ) {
                idade = i;
                return idade;
            }
        }

        public int qualSuaIdade

    }

}
