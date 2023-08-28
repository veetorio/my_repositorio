package Desafio.Desafio02.ex01.ex02;

import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        System.out.println("escreva o ano:");
        int ano = leia.nextInt();

        if(ano % 4 == 0)
        {
            System.out.println("O ano é bisexto");
        }

    }
}
