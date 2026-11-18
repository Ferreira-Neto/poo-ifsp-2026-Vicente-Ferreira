## Exercícios de revisão- Parte II

- Nome: Vicente Ferreira
- Data:


## Atividade 1: Validando um cadastro com String

1. ***Não, ele retorna uma nova String, foi confirmado com a necessidade de criar uma nova variavel e com  
o teste imprimindo a variavel original "nomeDigitado", que continua com os espaços.***  

2. ***Porque isEmpty só da true se nao tiver nenhum caracter, com o trim() antes, ele elimina os espaços antes e depois,    
para a validação com o isEmpty funcionar como esperado.***  

3. 

_Informe o prompt exato que você utilizou:_

***String é uma classe imutável em Java e o que isso implica para métodos como trim(), toUpperCase() e replace() ?***


_Registre a resposta gerada pela IA:_  

***Em Java, depois que um objeto String é criado, o conteúdo dele nunca muda.  
Nenhum método da classe altera os caracteres do objeto original. Quando parece que a String foi modificada,  
na verdade foi criado um novo objeto.
Os motivos principais do projeto da linguagem são:
Segurança: Strings são usadas em senhas, caminhos de arquivo e URLs. Se pudessem mudar depois de validadas,  
outro trecho do código poderia alterá-las.  
Reaproveitamento (String pool): como não mudam, o Java pode compartilhar a mesma String literal em vários  
lugares da memória sem risco de um alterar o valor do outro.  
Thread-safety: objetos imutáveis podem ser usados por várias threads ao mesmo tempo sem sincronização.  
Hash estável: o hashCode() de uma String não muda, o que a torna confiável como chave em HashMap e HashSet.  
O que isso implica para trim(), toUpperCase() e replace()  
Esses métodos não modificam a String original. Eles devolvem uma nova String com o resultado.  
Se você não guardar esse retorno, ele se perde.***  

>java  
String nome = "  maria  ";  
nome.trim();  
System.out.println(nome);     // "  maria  " (nada mudou)  
nome = nome.trim();           // agora guardamos o retorno  
System.out.println(nome);     // "maria"  
String maiuscula = nome.toUpperCase();  
System.out.println(nome);       // "maria" (original intacta)  
System.out.println(maiuscula);  // "MARIA"  
String nova = nome.replace('a', 'o');  
System.out.println(nome);   // "maria"  
System.out.println(nova);   // "morio"  

***O erro mais comum de iniciantes é escrever nome.toUpperCase();sozinho na linha e esperar que nome mude. Não muda.
Consequência prática
Como cada “alteração” cria um objeto novo, concatenar Strings dentro de um laço grande é ineficiente,  
pois gera muitos objetos descartáveis. Nesses casos, usa-se StringBuilder, que é mutável.***

_Registre, com suas palavras, a sua resposta:_  

***String é imutável, então trim(), toUpperCase() e replace() não alteram a variável original, mas retornam uma nova String,  
que precisa ser atribuída a uma variável para ser usada.***

## Atividade 2: Extraindo informações de um e-mail

***1. Erro: Exception in thread "main" java.lang.StringIndexOutOfBoundsExceptionRange  
[0, -1) out of bounds for length 21. Quando não encontra o caracter ele retorna -1.***

***2. Com o substring(indice) vai do índice até o fim, substring(0, indice) vai do começo até antes do índice.***

## Atividade 3: Comparando e quebrando uma linha de dados (CSV)

***1. linha.equals(outraLinha) = false, linha.equalsIgnoreCase(outraLinha) = true  
.equals compara também se é maiúsculo ou minúsculo.  
.equalsIgnoreCase ignora esse caso e compara apenas os carcteres***

***2.linha == outraLinha = false, porque são variaveis diferentes, == compara se as duas apontam   
para o mesmo local na memória, e não exatamente o conteúdo.***

##  Atividade 4: Criando a classe Produto e um ArrayList de produtos

***1.Com ArrayList<Produto> o compilador sabe que cada elemento é um Produto,  
com ArrayList<String> ou ArrayList<Object>, esses métodos não existiriam, só os de String/Object,   
e seria preciso fazer cast.***

***2.Não faria sentido porque ela depende de Produto para existir e funcionar,  
isso sugere uma relação de agregação.***

##  Atividade 5: Criando a classe Aluno e calculando estatísticas com ArrayList

***1.Média turma: NaN
Exception in thread "main" java.lang.NullPointerException  

***

***2.***

***3.***