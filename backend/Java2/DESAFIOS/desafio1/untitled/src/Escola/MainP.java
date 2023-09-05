package Escola;

import java.util.Locale;
import java.util.Scanner;

public class MainP
{
    static AcessoAdados dados = new AcessoAdados();
    public static void main(String[] args)
    {
        Aluno a = new Aluno("ettore",10,12,11,1020);
        Aluno b = new Aluno("wal",15,11,12,1020);
        Aluno c = new Aluno("aks",21,22,1,2020);

        dados.setAluno(a);
        dados.setAluno(b);
        dados.setAluno(c);

        dados.excludeAluno(a);
        dados.lista();

    }
}
