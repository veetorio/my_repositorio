package Desafio.Desafio02.ex05.ex08;

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
    Scanner leia = new Scanner(System.in);
    System.out.println("digite sua frase");
    String frase = leia.nextLine();
    for(int i = 0;i <= frase.length();i++)
    {
        System.out.println(frase.charAt(i));
    }

    }
}



