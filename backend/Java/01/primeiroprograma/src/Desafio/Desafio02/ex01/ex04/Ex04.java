package Desafio.Desafio02.ex01.ex04;

import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int i;
        int cont = 0;
        System.out.println("Digite um valor ");
        int source = leia.nextInt();
        for(i = 2;i <= source;i++)
        {
            if(source % i == 0)
            {
                cont++;
            }
        }
        if(cont <=10 )
        {
            System.out.println("é primo");
        }
        else
        {
            System.out.println("não é primo");
        }

    }
}

