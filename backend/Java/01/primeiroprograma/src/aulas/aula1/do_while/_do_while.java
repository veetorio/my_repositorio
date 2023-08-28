package aulas.aula1.do_while;

import java.util.Scanner;

public class _do_while
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        String name = "sair";
        do
        {
            System.out.print("deseja sair ?");
            name = leia.nextLine();

        }
        while (name.equalsIgnoreCase("não"));

    }
}
