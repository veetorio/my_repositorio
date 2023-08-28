package Desafio.Desafio02.ex01.ex03;

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Escreva a nota1 ");
        double nota1 = leia.nextDouble();

        System.out.print("Escreva a nota2 ");
        double nota2 = leia.nextDouble();

        double soma = (nota1+nota2)/2;

        boolean verify = soma >= 7 && soma <= 10;

        if(verify)
        {
            System.out.println("Aluno está aprovado");
        }
        else
        {
            System.out.println("aluno está reprovado");
        }

    }
}
