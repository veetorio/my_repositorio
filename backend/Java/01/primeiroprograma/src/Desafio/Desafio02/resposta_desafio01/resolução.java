package Desafio.Desafio02.resposta_desafio01;

import java.util.Scanner;

public class resolução
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o 1°");
        var sal = entrada.nextLine().replace(",",".");
        System.out.println("digite o 2°");
        var sal2 = entrada.nextLine().replace(",",".");
        System.out.println("digite o 3°");
        var sal3 = entrada.nextLine().replace(",",".");

        double num1 = Double.parseDouble(sal);
        double num2 = Double.parseDouble(sal2);
        double num3 = Double.parseDouble(sal3);

        double medsal = (num1 +num2+ num3)/3;
        System.out.println(medsal);
    }

}
