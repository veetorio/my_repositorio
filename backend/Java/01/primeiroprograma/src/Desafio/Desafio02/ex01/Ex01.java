package Desafio.Desafio02.ex01;

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

        boolean verify = num >= 0 && num <= 10;
        if(verify)
        {
            verify = num % 2 == 0;
            if (verify)
            {
                System.out.println("este valor está no intervalo,e é par "+num);

            }
            else
            {
                System.out.println("este valor está no intervalo,e é impar");
            }
        }
        else
        {
            System.out.println("este valor está fora do intervalo");
        }


    }
}
