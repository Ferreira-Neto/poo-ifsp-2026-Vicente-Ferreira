# Arrays, matrizes, ArrayList


- Nome: Vicente Ferreira  
- Data: 30/09/2026


### 3 Atividades práticas
### 3.1 Atividade 1: Esquenta  
### 3.2 Atividade 2: Arrays e matrizes: leitura, agregação e percurso  
https://github.com/Ferreira-Neto/poo-ifsp-2026-Vicente-Ferreira/tree/main/aula-04  


### 6. Responda:  
- (a) Indica que não era necessário, ja que chegou no mesmo resultado. Ao invés de verificar todas as combinações, com "somaDiagonal += matriz[i][i];" o código vai direto na combinação solicitada para o calculo, ou seja, onde linhas e colunas possuem o mesmo índice.  

- (b) É a escolha correta porque para a comparação de variavel maior, precisa inciar a comparação com um valor real fornecido, diferente se fosse utilizado Integer.MIN_VALUE ou iniciado com valor "0".  

- (c)

• Informe o prompt exato que você utilizou:  Copiei e colei o código "SomaDiagonalMatriz". "Sem corrigir o código, explique o que essa exceção significa e por que ela ocorre nesse contexto ?"  
• Registre a resposta gerada pela IA:  

O que a exceção significa  
ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 é uma exceção lançada pela JVM quando o programa tenta acessar uma posição de um array que não existe — ou seja, um índice fora da faixa válida.
A mensagem informa dois números importantes:
Index 3 — o índice que o programa tentou acessar.
for length 3 — o tamanho real do array (ele tem 3 elementos).
Como o array tem tamanho 3, seus índices válidos são 0, 1 e 2 (a contagem sempre começa em zero). O índice 3 simplesmente não existe nesse array — seria a "quarta posição" de um array que só tem três.
Por que isso ocorre especificamente nesse código
No seu código, a cada volta do laço externo (i), o laço interno (j) verifica a condição i == j. Quando essa condição é verdadeira, o código acessa:
java
matriz[i][j + 1]
O problema está no j + 1. Acompanhe o que acontece quando i chega em 2 (a última linha da matriz):
O laço interno testa j = 0, j = 1, j = 2.
A condição i == j só é verdadeira quando j = 2 (porque i também vale 2 nesse momento).
Nesse instante, o código tenta acessar matriz[2][2 + 1], ou seja, matriz[2][3].
Só que cada linha da matriz (matriz[i]) também tem apenas 3 colunas, com índices válidos 0, 1, 2. O índice 3 está uma posição além do limite daquela linha — não existe matriz[2][3] nessa matriz 3×3.
Por que a JVM se comporta assim
Diferente de algumas linguagens que permitiriam esse acesso silenciosamente (lendo um espaço de memória "vizinho" por engano, o que pode causar bugs graves e imprevisíveis), o Java faz uma verificação automática de limites toda vez que um array é acessado por índice. Se o índice pedido estiver fora do intervalo 0 até length - 1, a JVM interrompe a execução imediatamente e lança essa exceção, em vez de permitir um acesso inválido à memória.  
Isso é uma proteção de segurança e de correção: o erro acontece "alto e claro", no exato momento e linha em que o problema ocorreu (SomaDiagonalMatriz.java:18), facilitando identificar e corrigir a causa — em vez de deixar o programa continuar rodando com dados corrompidos ou resultados imprevisíveis.  

• A explicação da IA relaciona a exceção com o conceito de limites de um array
discutido na teoria da aula? Reverta a alteração após o teste.




