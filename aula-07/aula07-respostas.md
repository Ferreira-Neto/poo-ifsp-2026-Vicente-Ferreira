
## Exercícios de revisão- Parte I  

- Nome: Vicente Ferreira  
- Data:  


## Atividade 1:  
_1. Por que o compilador passou a recusar o acesso direto aos atributos depois da mudança para
private?_  
- **O modificador private restringe o acesso ao atributo à própria classe Produto.  
TesteProduto é outra classe, então o compilador recusa o acesso direto.**  


_2. Qual problema prático (do mundo real) o encapsulamento evitou neste exemplo, ao impedir
o acesso direto ao atributo preco?_  

- **Evitou que um preço inválido (negativo) como -50.0 fosse inserido
 em um produto ou um carrinho de compras, por exemplo.**  

3. _Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte por  
   que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código  
   profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes._  

   _• Informe o prompt exato que você utilizou:_  

Por que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código
profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes ?  

   _• Registre a resposta gerada pela IA:_  

   ### Falta de Validação e Controle:  
   Com um atributo público, qualquer trecho de código pode atribuir qualquer valor a ele a qualquer momento (ex.: usuario.idade = -50;  
   ou pedido.status = null;).  
   Utilizando métodos setters, você pode encapsular regras de negócio e validações para garantir que o objeto nunca fique em um estado inconsistente.  
   
   ### Acoplamento Forte e Fragilidade (O problema do Refatoramento):  
   Atributos públicos expõem diretamente a representação interna da sua classe.  
   Se você decidir mudar a forma como um dado é armazenado (por exemplo,  
   transformar um campo String nomeCompleto em dois campos String primeiroNome e String sobrenome),  
   qualquer código externo que acessava o campo público diretamente quebrará, exigindo uma reescrita em massa.  
   Impossibilidade de Adicionar Efeitos Colaterais (Side Effects):  
   Com métodos de acesso, você pode executar lógicas adicionais no momento em que um valor é lido ou alterado,  
   como:  
   Disparar eventos de notificação.  
   Atualizar caches ou invalidar dados derivados.  
   Registrar logs de auditoria (ex.: “O usuário X alterou o saldo às 14:00”).  
   Com o acesso direto a campos públicos, isso se torna impossível.  
   
   ### Concorrência e Thread-Safety:  
   Em sistemas corporativos de grande escala que rodam com múltiplas threads simultâneas,  
   expor campos públicos dificulta imensamente a aplicação de mecanismos de sincronização (synchronized ou locks),  
   abrindo brechas para condições de corrida (race conditions) e corrupção de dados.  

   ### Problemas que isso causa em Sistemas Grandes  
   Quando projetos crescem e equipes numerosas trabalham no mesmo código-base, o uso de atributos públicos gera impactos severos:  
   Dificuldade extrema de rastreio de bugs: Quando um valor corrompido é encontrado em um objeto, descobrir qual parte do sistema alterou aquele campo   
   diretamente é como procurar uma agulha no palheiro, já que não há um ponto centralizado (como um setter) onde se possa colocar um ponto de interrupção (breakpoint).  
   Impossibilidade de usar Interfaces de forma eficaz: Em Java, as interfaces definem contratos compostos por métodos, não por campos de dados.  
   Se o seu design depende de campos públicos, você perde a flexibilidade de aplicar o polimorfismo e substituir implementações facilmente.  
   Custo de manutenção insustentável: Pequenas mudanças de requisitos no domínio do negócio passam a exigir   
   alterações invasivas em cascata por todo o sistema, aumentando o tempo de entrega e o risco de regressões.

   _**• Registre, com suas palavras, a sua resposta:**_  
   Falta de validação e controle, com atributo público, qualquer trecho do código pode atribuir qualquer valor a ele a qualquer momento.  
   O problema do refatoramento, como por exemplo ser for alterar um campo String para dois campos Strings, qualquer código externo que
   acessava o campo público  diretamente quebrará.  
   Em sistemas grandes dificulta a aplicação de mecanismos de sincronização (synchronized ou locks). Assim como em projetos  
   que crescem e um grande número de desenvolvedor trabalham no mesmo código-base, o uso de atributos público dificulta o rastreio de bugs,  
   já que não há um ponto centralizado (com um setter) onde se possa colocar um breakpoint por exemplo.  
   Se o design do sistema depende de campos públicos, perde-se flexibilidade de aplicar o polimorfismo e substituir implementações facilmente.  
   já que pequenas mudanças passam a exigir açterações invasivas em cascata por todo o sistema, aumentando custo de manutenção tempo de entrega e o risco de regressões.






## Atividade 2:
_1. O que aconteceu com o preço do produto quando você chamou setPreco(-50.0)? O atributo
foi alterado?_  
O atributo não foi alterado. O if (p >= 0) do setter bloqueou a atribuição, e o preço manteve o valor anterior (no TesteProduto, 5.0).  

_2. Por que o setter é o lugar correto para validar dados, e não a classe que usa o objeto Produto?_  

Porque o setter é o ponto único de entrada para modificar o atributo. A regra fica em um só lugar e vale para qualquer código que use Produto.  
Se a validação ficasse na classe que usa o objeto, cada classe teria de repeti-la.  

_3. Como atribuir o parâmetro ao atributo de uma classe, se eles tiverem o mesmo nome?_

Usar o this.nome = nome; O this indica o atributo da instância, e o nome sem this é o parâmetro.  

_4. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte quais
   validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas
   bancários) além de checar valores negativos._  

   _• Informe o prompt exato que você utilizou:_  
   Quais validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas
   bancários) além de checar valores negativos ?


   _• Registre a resposta gerada pela IA:_  

   ### Validações gerais (qualquer sistema)  
   Nulo ou vazio: rejeitar null, "" e String só com espaços (nome == null || nome.trim().isEmpty()).  
   Tamanho: mínimo e máximo de caracteres, para respeitar o limite da coluna no banco e evitar abusos.  
   Formato: o dado precisa seguir um padrão, normalmente verificado com expressão regular (regex). Exemplos: e-mail, CPF/CNPJ, CEP, telefone, placa.  
   Faixa de valores: mínimo e máximo permitidos. Exemplos: idade entre 0 e 150, quantidade entre 1 e 999, nota entre 0 e 10.
   Valores permitidos: o dado só pode ser um de um conjunto conhecido. Exemplo: status só pode ser ATIVO, INATIVO ou BLOQUEADO. Em Java, isso costuma virar um enum.  
   Normalização: limpar o dado antes de guardar, com trim(), e-mail em minúsculas, CPF sem pontos e traços.  
   ### E-commerce  
   Preço: além de não ser negativo, normalmente precisa ser maior que zero, ter no máximo 2 casas decimais e não ultrapassar um teto.  
   Estoque: a quantidade não pode ficar negativa, e uma venda não pode ultrapassar o estoque disponível.  
   Desconto: entre 0% e 100%, e o preço final não pode ficar abaixo do custo (ou de um mínimo definido).  
   Código do produto (SKU): formato fixo e único no sistema.  
   Endereço de entrega: CEP válido e campos obrigatórios preenchidos.  
   Avaliação do produto: nota de 1 a 5.  
   ### Sistemas bancários  
   Valor de transação: maior que zero, com no máximo 2 casas decimais (por isso se evita double para dinheiro e usa-se BigDecimal).  
   Estado da conta: só aceita movimentação se estiver ativa, não bloqueada e não encerrada.  
   Saque: o valor não pode ser maior que o saldo mais o limite (cheque especial).  
   Limites operacionais: teto por transação e por dia. Exemplo: limite noturno do Pix.  
   CPF/CNPJ: não basta o formato, os dígitos verificadores também precisam ser válidos.  
   Agência e número da conta: formato correto, com dígito verificador.  
   Titularidade: o titular não pode ser vazio, e muitas vezes não pode ser alterado depois da criação (sem setter).  
   Senha/PIN: tamanho mínimo, complexidade e proibição de sequências óbvias como 1234.  
   ### Pontos de projeto  
   O que fazer quando o dado é inválido: no seu exercício, o setter ignora o valor em silêncio.  
   Em sistemas reais é mais comum lançar uma exceção (por exemplo IllegalArgumentException("Preço deve ser maior que zero")),  
   para quem chamou saber que a operação falhou.  
   Regras de negócio x validação de dado: o setter deve validar a integridade do próprio atributo.  
   Regras que envolvem vários objetos ou o banco de dados (como “CPF já cadastrado”) ficam em outra camada, geralmente uma classe de serviço.  
   Validação em camadas: os sistemas validam na interface, na API e no banco, além do setter.  
   O setter é a última barreira, que garante que o objeto nunca fique em estado inválido.  
   

   _• Registre, com suas palavras, a sua resposta:_  

   Além de valores negativos, os setters costumam validar nulo/vazio, tamanho, formato (regex, CPF, e-mail),  
   faixa permitida e regras do domínio, como limite de saque no banco ou estoque no e-commerce.  


## Atividade 3: O operador this resolvendo conflito de nomes  

   1. O que aconteceu com os atributos nome e idade do objeto quando você removeu o this? Por quê?  
   ***Sem o this, nome = nome; atribui o parâmetro a ele mesmo e o atributo nunca é tocado.  
   O objeto fica com os valores padrão: getNome() retorna null e getIdade() retorna 0. O parâmetro "esconde" o atributo (shadowing).***  

   2. Em que situação o this é obrigatório para o código funcionar corretamente, dentro de um
   método ou construtor?  
   ***O this é obrigatório quando um parâmetro ou variável local tem o mesmo nome do atributo e você quer acessar o atributo.  
   Também é necessário para chamar outro construtor com this() e para passar a própria instância como argumento.***


   3. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), descreva o com  
   portamento observado no item 2 e peça para a IA explicar o conceito de "escopo de variá  
   vel"(shadowing) relacionado a esse erro.  

   • Informe o prompt exato que você utilizou:  

   Uma classe em java "Pessoa" com os atributos nome e idade. No construtor Pessoa(String nome, int idade),  
   escrevi “nome = nome; idade = idade;” sem usar this. Ao criar new Pessoa(“Ana”, 20), getNome() retornou null e getIdade() retornou 0.  
   Explique o conceito de escopo de variável e de shadowing e como eles se relacionam com esse comportamento.  

   • Registre a resposta gerada pela IA:  

   ### Comportamento observado
   Ao remover o this do construtor de Pessoa (nome = nome; e idade = idade;) e criar new Pessoa("Ana", 20),  
   o programa compila sem erro, mas getNome() retorna null e getIdade() retorna 0. Os valores passados no new se perdem,  
   e o objeto fica com os valores padrão dos tipos.  
   
   ### Escopo de variável  
   
   O escopo é a região do código onde uma variável existe e pode ser usada.
   O atributo (private String nome;) pertence ao objeto e vale na classe inteira.
   O parâmetro (String nome no construtor) é uma variável local, e só existe dentro do construtor.  

   ### Shadowing (sombreamento)  
   Shadowing ocorre quando uma variável de escopo mais interno tem o mesmo nome de uma de escopo mais externo.  
   Dentro do construtor, o nome nome passa a se referir ao parâmetro, e o atributo fica “escondido atrás dele”.

   • Registre, com suas palavras, a sua resposta:  
   ***Dentro do construtor, o parâmetro nome tem o mesmo nome do atributo e o esconde (shadowing).  
   Por isso nome = nome atribui o parâmetro a ele mesmo,  
   e o atributo fica com null e 0. Usando this.nome = nome o Java entende que o da esquerda é o atributo.***  

## Atividade 4: Construtor padrão x construtor parametrizado

_1. Por que o Java não gerou um construtor padrão automaticamente para a classe Livro antes do passo 2?_  

***Porque o compilador só gera o construtor padrão implícito quando a classe não declara nenhum construtor.***

_2. Em que momento o construtor padrão de uma classe deixa de ser gerado automaticamente pelo compilador?_  

***No momento em que a classe declara qualquer construtor, com ou sem parâmetros.***

_3. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte o que é  
   o "construtor padrão implícito"gerado pelo compilador Java e em quais condições exatas ele  
   deixa de existir._  

   _• Informe o prompt exato que você utilizou:_  

   ***O que é o "construtor padrão implícito"gerado pelo compilador Java e em quais condições exatas ele  
   deixa de existir?***  

   _• Registre a resposta gerada pela IA:_  

É um construtor sem parâmetros que o compilador Java cria automaticamente quando você não escreve nenhum construtor na classe.  

O que esse construtor faz:  
Chama super(): executa o construtor sem parâmetros da superclasse (Object, quando não há herança explícita).  
Não inicializa nada com valores seus: os atributos ficam com os valores padrão do tipo. São null para objetos,  
0 para números e false para boolean. Isso acontece na criação do objeto, não por causa do construtor.  
Tem a mesma visibilidade da classe: em public class, o construtor é public. Em uma classe sem modificador (pacote), é package-private.  

Em que condição ele existe  
Ele só é gerado se a classe não declarar nenhum construtor.  
Quando ele deixa de existir  
Ele deixa de ser gerado assim que você declara qualquer construtor.  

Por que o Java faz assim
O objetivo é dar ao programador o controle sobre como o objeto pode ser criado. Se você escreveu um construtor com parâmetros,   
provavelmente quer obrigar que o objeto nasça com esses dados.  
Se o compilador criasse um padrão extra, seria possível criar objetos incompletos sem querer.  

   _• Registre, com suas palavras, a sua resposta:_  

***O construtor padrão implícito é um construtor sem parâmetros que o compilador cria sozinho quando a classe não declara nenhum construtor.  
Ele deixa de existir assim que eu escrevo qualquer construtor.***  


## Atividade 5: Sobrecarregando construtores 

_1. Como o compilador Java decide qual dos três construtores será chamado em cada new
   Retangulo(...)?_

***Pela quantidade e tipos dos argumentos, "r1" sem parâmetros,  
"r2" um double e o "r3" de dois double.***

_2. O que aconteceria se você tentasse criar um quarto construtor Retangulo(double altura)
   além do Retangulo(double lado) já existente? Teste e registre o erro._  

***Erro = java: constructor Retangulo(double) is already defined in class Retangulo  
Dá erro de compilação, pois Retangulo(double altura) tem a mesma assinatura de Retangulo(double lado).***



_3. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte por que
   a assinatura de um método/construtor não considera o nome dos parâmetros, apenas seus
   tipos e quantidade, e peça um exemplo de sobrecarga que causa ambiguidade._

   _• Informe o prompt exato que você utilizou:_  
***Por que em java a assinatura de um método/construtor não considera o nome dos parâmetros, apenas seus
tipos e quantidade? De um exemplo de sobrecarga que causa ambiguidade***

   _• Registre a resposta gerada pela IA:_  

O compilador escolhe qual método ou construtor chamar olhando para a chamada,  
e a chamada só traz os valores dos argumentos, não os nomes dos parâmetros.  

### Chamada posicional e não nomeada:  
Em Java, os argumentos são passados para um método com base em suas posições,  
e não em seus nomes (diferente de linguagens como Python ou C#, que suportam argumentos nomeados).  
Quando você chama soma(5, 10), para o compilador e para a Máquina Virtual Java (JVM)  
o que importa é que são dois valores inteiros (int, int), e não como eles foram nomeados na declaração  
(a e b versus x e y).  

### Histórico e o Bytecode:  
Historicamente, os nomes das variáveis locais e dos parâmetros não eram preservados  
no arquivo .class compilado — a JVM armazena apenas os tipos para manter o bytecode otimizado e compacto.  
Embora a partir do Java 8 seja possível preservar os nomes dos parâmetros usando a flag -compiler (-parameters),  
a especificação da linguagem manteve que os nomes não definem a identidade do método, garantindo a compatibilidade  
binária.  

### Manutenibilidade: 
Se os nomes dos parâmetros fizessem parte da assinatura, renomear um parâmetro em uma biblioteca de terceiros  
quebraria todos os códigos que dependem dela, mesmo que os tipos e a lógica permanecessem idênticos.  

Exemplos de sobrecarga que causa ambiguidade
A sobrecarga é aceita na declaração, mas algumas chamadas não permitem ao compilador decidir.
Exemplo 1: dois métodos com tipos trocados
java
public class Calculadora {
public void somar(int a, double b) { System.out.println("int, double"); }
public void somar(double a, int b) { System.out.println("double, int"); }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.somar(1, 2.5);   // OK: só a primeira serve
        c.somar(1.5, 2);   // OK: só a segunda serve
        c.somar(1, 2);     // ERRO: ambígua
    }


As declarações compilam, pois as assinaturas são diferentes. O problema está em somar(1, 2): com dois int,  
as duas versões servem, porque cada uma converte um dos argumentos para double.  

   _• Registre, com suas palavras, a sua resposta:_  

***Os nomes dos parâmetros só existem dentro do método, e quem chama passa apenas valores, sem informar nomes.  
Por isso o compilador só usa quantidade e tipos para escolher qual versão executar.  
Se dois métodos têm os mesmos tipos, são considerados iguais, mesmo com nomes diferentes.  
Também pode haver ambiguidade quando uma chamada serve para duas versões.***

## Atividade 6: Encadeando construtores com this()

_1. O que acontece se você tentar colocar this(...) como a segunda instrução de um cons
   trutor, depois de outra linha de código? Teste e registre o erro apresentado pelo compilador._  

***call to this must be first statement in constructor***

_2. Compare esta versão com a da Atividade 5: qual vantagem prática o uso de this() trouxe
   para a manutenção do código (ex: se a fórmula de inicialização mudasse)?_  

***A lógica de inicialização fica em um único construtor. Se a fórmula ou uma validação mudar,  
ela é alterada em um só lugar, e os outros construtores herdam a mudança.  
Na Atividade 5 o mesmo ajuste teria de ser feito em três construtores***

_3. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte por que
   this() precisa obrigatoriamente ser a primeira instrução do construtor e o que o compilador
   Java faz "por trás dos panos"quando um objeto é criado._  

   _• Informe o prompt exato que você utilizou:_  

***Por que this() precisa obrigatoriamente ser a primeira instrução do construtor e o que o compilador
Java faz "por trás dos panos"quando um objeto é criado?***  

   _• Registre a resposta gerada pela IA:_  

***Por que this() precisa ser a primeira instrução?  
A regra existe para garantir uma coisa: a superclasse é totalmente construída antes que qualquer código da  
subclasse use o objeto.  
Todo construtor, em algum ponto, precisa chamar um construtor da superclasse (super(...)).  
Se você não escreve nada, o compilador insere um super() implícito como primeira instrução.  
Já o this(...) só delega para outro construtor da mesma classe, e é esse outro construtor que vai acabar chamando  
o super(...). Por isso:  
Um construtor chama this(...) ou super(...), nunca os dois. Se pudesse ter ambos, a superclasse seria inicializada   
duas vezes.  
Quando o construtor começa com this(...), o compilador não insere o super() implícito, porque ele será  
chamado no construtor delegado.  
Se houvesse código antes dessa chamada, ele poderia usar um this ainda semi-construído  
(campos sem inicializar, superclasse inacabada).Por isso o Java proíbe, por exemplo, this(getX()) e dá o erro  
“cannot reference this before supertype constructor has been called”.  
Métodos static e valores literais nos argumentos são permitidos.  
Atualização: a partir do Java 25 (flexible constructor bodies, JEP 513), é permitido ter algumas instruções  
antes de this(...)/super(...), desde que não usem a instância que ainda está sendo construída (validar argumentos,  
calcular valores, por exemplo). Ou seja, a ideia de fundo continua a mesma, mas a regra ficou mais flexível.***

   _• Registre, com suas palavras, a sua resposta:_  

***Em Java o this() precisa ser a primeira instrução do construtor porque todo objeto só pode ser usado depois que  
a sua superclasse foi totalmente construída. O this() apenas repassa o trabalho para outro construtor da mesma classe,  
e é esse outro construtor que vai chamar o super().  
Por isso um construtor usa this() ou super(), nunca os dois, e sempre na primeira linha:***  

## Atividade 7: Construtor de cópia usando this()

***1- O new Pessoa(p1) cria um novo objeto no heap. Os valores de p1 são copiados para os atributos do novo objeto,  
e cada variável aponta para o seu próprio objeto.***  

***2-Em Java, private restringe o acesso por classe, não por objeto. O código dentro de Pessoa pode acessar os atributos privados de qualquer outra instância de Pessoa,  
como outra.nome.***


## Atividade 8: Sobrecarregando métodos comuns

***1-Os parâmetros quantidade e tipos.***

***2-Não, porque possuem a mesma assinatura e só
diferem no retorno. Erro method somar(int,int) is already defined in class Calculadora***


## Atividade 9: Varargs

***1-Não houve ambiguidade o compilador escolheu TesteCalculadora,  
a linha somar(int a, int b). Na versao: int, int impressa mostra isso, o Java tenta
primeiro métodos de aridade fixa, sem boxing e sem varargs, e só recorre ao varargs se
nenhum servir.***  

***2-Dentro do método os numeros se comportam como um array (int[] ) tem .length,  
é indexável e pode ser percorrido com for-each***

## Atividade 10: Integrando tudo, a classe ContaBancaria

***1-No construtor completo this.titular = titular; separa o atributo do parâmetro
de mesmo nome.  
Em this(titular, 0, true); o construtor de um parâmetro repassa para o construtor completo.  
Em depositar, this.saldo += valor é opcional, porque não há conflito de nomes.
Serve só para deixar explícito que se trata de um atributo.***