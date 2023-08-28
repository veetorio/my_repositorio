package aulas.aula1.desafioarray;

import java.util.Scanner;

public class Desafio01
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int qtd = leia.nextInt();

        double[] notas = new double[qtd];
        int i;
        for(i = 0;i < notas.length;i++)
        {
            System.out.printf("Digite a nota %sº: ",(i+1));
            notas[i] = leia.nextDouble();
        }
        double tot = 0;
        for (double sum:notas)
        {
            tot += sum;
        }
        System.out.printf("média é %.2f",tot/notas.length);


        leia.close();
    }
}
