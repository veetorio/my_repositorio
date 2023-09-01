package DesafioPessoal.DesafioAluno;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcessarDadosAlunos
{
    List<Aluno> Alunos = new ArrayList<>();
    void addAlunos(Aluno a)
    {
        Alunos.add(a);
    }
    void excluirAluno()
    {
        Alunos.remove(Alunos.size()-1);
    }
    void exibirStats()
    {
        System.out.println(Alunos.toString());
    }


}
