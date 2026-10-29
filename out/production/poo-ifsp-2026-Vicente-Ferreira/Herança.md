## Herança

- classe é TAD
- classes se relacionam
- herança é um tipo de relacionamento entre classes
- favorece reutilização de código

- observar caracteristicas e comportamentos semelhantes entre classes
---
- Exemplo:  

- PACIENTE
- nome
- cpf
  
- MEDICO
- nome
- cpf
---

- Herança é o relacionamento("é um") generalização/especialização

PESSOA(TIPO) < MEDICO(SUBTIPO)  ("herda" "estende")  GERAL/BASE/SUPERCLASSE    ESPECIFICA/DERIVADAS/SUBCLASSE/FILHA
PESSOA < PACIENTE

PC(todo) > Cpu mouse monitor(partes)  

---

- HERANÇA
- Herança simples ou multipla(C++)

(Problema do diamante)
nome P   nome M  
    nome F  
  ?nome f1  f2  

- Java herança simples

CLASSE RAIZ DO JAVA  
  OBJECT < PESSOA(getNome()) < PACIENTE  
  p.getNome();  

  public Paciente extends Pessoa {  
  }  

  public MinhaTela extends Application {  
  
  }  



