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
        

        while (true)
        {
            System.out.println("Deseja iniciar ?");
            String result = leia.next();

            if(!"sim".equals(result)){break;}

            System.out.println("digite seu id");
            int Mainid = Integer.parseInt(leia.next());

            System.out.println("Digite seu nome");
            String Mainnome = leia.next();

            System.out.println("Digite seu curso");
            String Maincurso = leia.next();

            aluno.addAluno(Mainid,new Aluno(Mainnome,Maincurso));


        }


    }
}
