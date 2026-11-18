package parte2;

public class TesteTurma {
    public static void main ( String[] args )   {

    Turma turma = new Turma();
    turma.matricular( new Aluno("Ana", 8.5) );
    turma.matricular( new Aluno("Maria", 9) );
    turma.matricular( new Aluno("João", 8) );
    turma.matricular( new Aluno("José", 9.5) );

    System.out.println("Média turma: " + turma.calcularMedia() );
    System.out.println("Melhor aluno: " + turma.encontrarMelhorAluno().getNome() );


    }

}