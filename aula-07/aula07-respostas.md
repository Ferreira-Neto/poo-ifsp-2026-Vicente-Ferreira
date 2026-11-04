
## Exercícios de revisão- Parte I  

- Nome: Vicente Ferreira  
- Data:  


### Atividade 1:  
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
   Com um atributo público, qualquer trecho de código pode atribuir qualquer valor a ele a qualquer momento (ex.: usuario.idade = -50; ou pedido.status = null;).  
   Utilizando métodos setters, você pode encapsular regras de negócio e validações para garantir que o objeto nunca fique em um estado inconsistente.  
   
   ### Acoplamento Forte e Fragilidade (O problema do Refatoramento):  
   Atributos públicos expõem diretamente a representação interna da sua classe.  
   Se você decidir mudar a forma como um dado é armazenado (por exemplo, transformar um campo String nomeCompleto em dois campos String primeiroNome e String sobrenome),  
   qualquer código externo que acessava o campo público diretamente quebrará, exigindo uma reescrita em massa.  
   Impossibilidade de Adicionar Efeitos Colaterais (Side Effects):  
   Com métodos de acesso, você pode executar lógicas adicionais no momento em que um valor é lido ou alterado, como:  
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






### Atividade 2:
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


### Atividade 3: O operador this resolvendo conflito de nomes  

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