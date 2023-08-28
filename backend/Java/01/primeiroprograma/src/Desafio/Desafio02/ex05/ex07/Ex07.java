package Desafio.Desafio02.ex05.ex07;

import java.util.Scanner;

public class Ex07
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double soma = 0;
        double ex = 0;

        do
        {
            System.out.println("Digite algum valor: ");
            double valor = leia.nextDouble();
            soma += valor;
            ex = valor;
        }
        while(ex > 0);
        System.out.println(soma);

    }
}
