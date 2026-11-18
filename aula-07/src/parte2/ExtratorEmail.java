package parte2;

public class ExtratorEmail {

    public static void main(String[] args) {

        String email = "joao.silvaifsp.edu.br";

// TODO 1: use indexOf('@') para descobrir a posição do símbolo @
        int pos = email.indexOf('@');

// TODO 2: use substring(...) para extrair o texto ANTES do @ (usuário)
        String usuario = email.substring(0, pos);

// TODO 3: use substring(...) para extrair o texto DEPOIS do @ (domínio)
        String dominio = email.substring(pos + 1);

// TODO 4: use contains(...) para verificar se o domínio contém "ifsp" e imprima "E-mail institucional" ou "E-mail externo"
        if ( dominio.contains("ifsp") ) {
            System.out.println("E-mail institucional");
        }   else {
                System.out.println("E-mail externo");
        }


    }
}