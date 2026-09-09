- classe
- atributo
- método
- objeto
- abstração

classe: tipo abstrato de dado  

- propriedades(atributos) -> dados  
      +  
- métodos (funções)  

String nome;  
Scanner teclado;  

Carro:  
cor  
motor  
tamanho  
modelo  
torque  
preço  

+ acelerar()  
+ frear()  
+ desligar()  
+ virar()  
+ ligsr()  

carro fusca(objeto) = new class();  

carro porsche =  new class();  

.f  
.p  

objeto é uma instância da classe  

EX:  

realizar cirurgia()  
medico m1 = new medico()  
cirurgia c1 = new cirurgia()  

m1 realizaCirurgia(c1); -> método  

---

Relacionamentos entre classes  

+ UML: Ling.Modelagem Unificada  

Diagrama de classe



| cirurgia |
| -------- |
|- cirurgia|
|- risco   |
|- paciente|
| + agendar|
| + executar| 

0 ou N  
/\  
Realiza  
1  

| medico | 
| -------- | 
|- nome | 
|-  especialidade  | 
| +realizar() |

| pessoa |
| -------- |
| - nome |
| + qualnome()|

privado = "-"  
publico = "+"

---

Tipos de relacionamentos  

- Associação
- Agregação
- Composição
- Herança
- Interfaces

Agregaçao e Composição = Relação todo-parte  

Associação Uma classe usa ou se relaciona com outra, mas cada uma existe de forma independente.  

Herança relação de geneticidade/especializações  






