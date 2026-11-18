package parte2;

import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
             alunos.add(aluno);                                               // TODO: adicione aluno na lista "alunos"

    }

    public double calcularMedia() {
                                                                            // TODO: percorra "alunos", some as notas e divida pela quantidade de alunos(cuidado com o caso de a turma estar vazia!)
        if ( alunos.isEmpty() ) {
         return 0;
        }
        double soma = 0;
                for ( Aluno a : alunos )    {
                    soma += a.getNota();
                }
                return soma / alunos.size();
    }

    public Aluno encontrarMelhorAluno() {
                                                            // TODO: percorra "alunos" e retorne o Aluno com a maior nota
        Aluno melhorAluno = null;
        for ( Aluno a : alunos )    {
            if ( melhorAluno == null || a.getNota() > melhorAluno.getNota() )   {
                melhorAluno = a;
            }
        }
        return melhorAluno;

    }
}
