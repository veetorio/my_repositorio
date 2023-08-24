package Desafio03;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int cont = 0;
        double somas = 0;

        System.out.print("Digite 1/entrar e -1/sair");
        int entrada = leia.nextInt();

        while(entrada == 1)
        {
            double notas;
            System.out.print("Digite sua nota");
            notas = leia.nextDouble();
            if (notas > 0 && notas <= 10)
            {
                cont ++;
                somas += notas;
            }
            else
            {
                System.out.println("digite sua nota novamente, sua nota deve estar entre 0 e 10");
                notas = leia.nextDouble();
            }
            System.out.println("deseja continuar ?");
            entrada = leia.nextInt();
        }
        System.out.println("A média do aluno"+somas/cont);
    }
}
