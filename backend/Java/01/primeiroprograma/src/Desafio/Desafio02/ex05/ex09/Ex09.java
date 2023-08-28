package Desafio.Desafio02.ex05.ex09;

import java.util.Scanner;

public class Ex09
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int i;

        System.out.println("Digite algum valor: ");
        double val = leia.nextDouble();
        double comparator = val;

        for(i = 0;i <= 10;i++)
        {
            System.out.println("Digite algum valor: ");

            double entrada = leia.nextDouble();
            if(entrada > comparator)
            {
                comparator = entrada;
            }
        }
        System.out.println(comparator);

    }

}
