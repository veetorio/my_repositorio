package PooAulas.Relacao1p1.RelacaoNpN;

import java.util.ArrayList;
import java.util.List;

public class Curso
{
    String nome;
    Curso(String _nome)
    {
        this.nome = _nome;
    }
    List<Aluno> alunos = new ArrayList<Aluno>();

    void adicionarAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
