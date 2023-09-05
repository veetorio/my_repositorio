package Escola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class AcessoAdados
{
    private final List<String> dadosAlunos = new ArrayList<>();

    void setAluno(Aluno aluno)
    {
        dadosAlunos.add(aluno.setStats());
    }
void excludeAluno(Aluno y)
{
    for (int i = 0; i < dadosAlunos.size(); i++)
    {
        if (y.setStats().equals(dadosAlunos.get(i)))
        {
            dadosAlunos.remove(i);

        }
    }
}
    void lista()
    {
        int cont = 0;
        for (String nomelista: dadosAlunos)
        {
            cont++;
            System.out.println(cont+"==>"+nomelista);
        }
    }
}
