package Desafio.Desafio02.ex05;

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        int i;
        int cont = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite algum valor");
        int val = leia.nextInt();

        for(i = 1;i <= val;i++)
        {
            if(val % i == 0)
            {
                cont++;
            }
        }
        switch (cont)
        {
            case 2:
                System.out.println("O valor digitado é primo");
                break;
            default:
                System.out.println("o valor digitado não é primo");
                break;
        }


    }


}
