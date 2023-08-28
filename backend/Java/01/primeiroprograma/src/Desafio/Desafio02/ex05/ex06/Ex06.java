package Desafio.Desafio02.ex05.ex06;

import java.util.Scanner;

public class Ex06
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        double random = Math.floor(Math.random()*100);
        int i = 0;
        do
        {


            System.out.println(random);
            System.out.println("Digite algum valor");
            double aposta = leia.nextDouble();


            if (aposta > random)
            {
                System.out.println("o valor digitado é maior que o gerado");
            }
            else if (aposta < random)
            {
                System.out.println("o valor digitado é menor que o gerado");
            }
            else
            {
                System.out.println(" você acertou, o valor gerado é "+aposta);
                break;
            }
            i++;
            int _try = 10 - i;
            System.out.println("Tentivas:"+_try);
        }
        while(i <= 10);






    }
}
