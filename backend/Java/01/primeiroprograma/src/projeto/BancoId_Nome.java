package projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BancoId_Nome
{
    Map<Integer,Aluno> banco = new HashMap<>();

    void addAluno(int id,Aluno a)
    {
        banco.put(id,a);
        for (int Bancoid : banco.keySet())
        {
            System.out.println(Bancoid);
        }
    }


}
