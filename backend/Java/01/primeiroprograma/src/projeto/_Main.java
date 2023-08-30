package projeto;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class _Main
{
    public static void main(String[] args)
    {
        BancoId_Nome aluno = new BancoId_Nome();
        Scanner leia = new Scanner(System.in);
        
        boolean loop = true;
        while (loop)
        {
            System.out.println("Digite seu nome");
            String Mainnome = leia.nextLine();
            System.out.println("Digite seu curso");
            String Maincurso = leia.nextLine();

            System.out.println("digite seu id");
            int Mainid = leia.nextInt();
            aluno.addAluno(Mainid,new Aluno(Mainnome,Maincurso));

            System.out.println("Deseja iniciar ?");
            String result = leia.nextLine();

            if(result.equals("Sim"))
            {
                break;
            }
        }


    }
}
