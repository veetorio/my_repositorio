package aulas.aula1._while02;

import java.util.Scanner;

public class _whilev2
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        String entrada = "";

        while(!entrada.equalsIgnoreCase("sair"))
        {
            System.out.print("deseja entrar: ");
            entrada = (leia.next());

        }


    }
}
