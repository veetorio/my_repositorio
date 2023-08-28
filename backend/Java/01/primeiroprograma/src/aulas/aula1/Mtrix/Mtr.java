package aulas.aula1.Mtrix;

import java.util.Arrays;
import java.util.Scanner;

public class Mtr
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int tot = 0;

        System.out.println("Quantos aluno");
        int qtd = leia.nextInt();

        System.out.println("Notas dos alunos: ");
        int notas = leia.nextInt();

        double[][] notalu = new double[qtd][notas];

        for (int i = 0;i < notalu.length;i++)
        {
            for (int a = 0;a < notalu[i].length;a++)
            {
                System.out.printf("Digite a nota %d para o aluno %d ",i,a);
                notalu [i][a] = leia.nextDouble();
                tot += notalu[i][a];
            }

        }
        for(double[] alunos:notalu)
        {
            System.out.println(Arrays.toString(alunos));
        }
        System.out.println(tot/(qtd*notas));

    }
}
