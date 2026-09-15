public class Pessoa {
    private String nome;
    private int idade;
    private String ultimoNome;


    private void dividirString(String texto){
        String [] nomes = texto.split(" ");
        nome = nomes[0];
        ultimoNome = nomes[1];
    }

    public void altereSeuNomePara(String novoNome){
        if (novoNome == null || novoNome.isBlank()){
            //System.err.println("Campo novoNome vazio ou nulo");
            //return;
            throw new IllegalArgumentException("Campo novoNome vazio ou nulo");
        }
        dividirString(novoNome);
    }

    public void alterarIdade(int i){
        if (i >= 0 && i <= 120){
            idade = i;
        }
    }

    public String qualSeuNome(){
        return nome.toUpperCase();
    }

    public int qualSuaIdade(){
        return idade;
    }

    public String qualUltimoNome(){
        return ultimoNome;
    }

}
