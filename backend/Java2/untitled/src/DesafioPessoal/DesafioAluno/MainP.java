package DesafioPessoal.DesafioAluno;

public class MainP
{
    public static void main(String[] args)
    {
        Aluno a = new Aluno("Joao",18,27,04,2013);
        Aluno b = new Aluno("Luan",19,24,2,2019);
        AcessarDadosAlunos acesso = new AcessarDadosAlunos();
        acesso.addAlunos(a);
        acesso.addAlunos(b);
        acesso.exibirStats();

    }
}
