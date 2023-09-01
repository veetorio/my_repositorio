package DesafioPessoal.DesafioAluno;

public class MainP
{
    public static void main(String[] args)
    {
        AcessarDadosAlunos acesso = new AcessarDadosAlunos();
        Aluno a = new Aluno("Ettore",10,27,9,2019);
        acesso.addAlunos(a);
        acesso.exibirStats();

    }
}
