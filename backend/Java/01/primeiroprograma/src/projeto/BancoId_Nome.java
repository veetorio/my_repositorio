package projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BancoId_Nome
{
    Map<Integer,Aluno> banco = new HashMap<>();

    void addAluno()
    {
        banco.put(2334,new Aluno("Ettore","Física"));
    }


}
