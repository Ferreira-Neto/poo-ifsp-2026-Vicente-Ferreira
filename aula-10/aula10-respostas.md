## Herança

---
### 2.1 Atividade 1: Sistema de funcionários da empresa
### 2.1.1 Passo 1: O problema da duplicação  


***Imagine que a empresa precise incluir o atributo dataAdmissao em todos os funcionários.
   Em quantos lugares você precisaria alterar o código?***

>Em dois lugares, private String dataAdmisao para Gerente.java e Desenvolvedor.java

***1.***
>O java insere automaticamente o super() sem argumentos, como primeira linha do construtor.  
Se Funcionario só tem construtor com parâmetros, esse construto padrão não existe.

***2.***
>O método vem de Object, superclasse de toda classe em Java.  
O @Override é recomendado porque o compilador verifica se você realmente está sobrescrevendo.

***3.***

>Quando a herança é uma má escolha de projeto e em que situações a composição é preferível? Dê um exemplo em Java no contexto de funcionários,  
em que um funcionário pode ter vários papéis ao mesmo tempo ?

***Herança vs. composição***  

Quando a herança é uma má escolha  
1. A relação não é um “é um” de verdade. Herança só faz sentido quando a subclasse realmente é um tipo da superclasse, em todos os contextos. “Gerente é um Funcionário” funciona. “Gerente é um tipo de Lista de Subordinados” não.

2. O papel muda ao longo do tempo. Um objeto não muda de classe depois de criado. Se o Bruno é Desenvolvedor hoje e vira Gerente no ano que vem, você precisa criar outro objeto e copiar os dados, perdendo a identidade.

3. Uma pessoa acumula papéis. Java só tem herança simples. Se Ana é gerente e desenvolvedora, você não pode fazer class GerenteDesenvolvedor extends Gerente, Desenvolvedor. Criar uma classe para cada combinação causa explosão de classes (GerenteDesenvolvedor, GerenteTester, DesenvolvedorTester...).

4. Acoplamento forte com a superclasse (fragile base class). Qualquer mudança em Funcionario pode quebrar todas as subclasses, e a subclasse depende de detalhes internos do pai, sobretudo com protected.

5. A subclasse herda o que não deveria. Ela carrega todos os métodos públicos do pai, mesmo os que não fazem sentido para ela.
Quando preferir composição
Quando a relação é de “tem um” ou “pode fazer”, quando o comportamento precisa variar em tempo de execução, ou quando é preciso combinar comportamentos independentes. A regra clássica: “prefira composição à herança” (Effective Java, Item 18).
Exemplo: funcionário com vários papéis
Em vez de Gerente e Desenvolvedor serem subclasses, eles viram papéis que um funcionário possui.

>A herança é ruim quando o papel muda ou se acumula, porque Java só permite um pai. Nesse caso,o funcionário deve ter uma lista de papéis em vez de ser subclasse de um deles.