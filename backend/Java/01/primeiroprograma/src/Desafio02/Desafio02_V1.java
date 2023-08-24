package Desafio02;

import java.util.Scanner;

public class Desafio02_V1
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        System.out.println("digite a numeração da semana");
        byte dia = leia.nextByte();
        System.out.println(Dia(dia));
    }
    static String Dia(byte entrada)
    {
        switch (entrada)
        {
            case 1:
                return "segunda";
            case 2:
                return "terca-feira";
            case 3:
                return "quarta-feira";

            case 4:
                return  "quinta-feira";

            case 5:
                return "sexta-feira";

            case 6:
                return "sabado";

            case 7:
                return "domingo";

            default:
                return "não foi encontrado";
        }
    }
}

