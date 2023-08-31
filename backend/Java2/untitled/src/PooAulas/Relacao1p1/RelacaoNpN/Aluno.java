package PooAulas.Relacao1p1.RelacaoNpN;

import java.util.ArrayList;
import java.util.List;

public class Aluno
{
    String nome;
    final List<Curso> cursos = new ArrayList<Curso>();
    Aluno(String _nome)
    {

        this.nome = _nome;
    }

    void adicionarCurso(Curso curso)
    {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
