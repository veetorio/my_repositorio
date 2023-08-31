package PooAulas.Relacao1p1.RelacaoNpN;

public class NpN
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno("Ettore");
        Aluno aluno2 = new Aluno("Ilicht");
        Aluno aluno3 = new Aluno("Ada");

        Curso curso1 = new Curso("Backend");
        Curso curso2 = new Curso("Frontend");
        Curso curso3 = new Curso("Ux/Ui");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);

        for (Aluno aluno:curso1.alunos)
        {
            System.out.println(aluno.nome);
        }
        for (Curso curso: aluno1.cursos)
        {
            System.out.println(curso.nome);
        }
    }


}
