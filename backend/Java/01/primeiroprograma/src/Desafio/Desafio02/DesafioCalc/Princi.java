package Desafio.Desafio02.DesafioCalc;

import java.util.Scanner;

public class Princi
{
    public static void main(String[] args)
    {
        double result = 0;
        Calc calc = new Calc();
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite seu operador (+,-,/,*,%) ");
        String op = leia.next();
        System.out.println("Digite os valores a serem operados");
        double n1 = leia.nextDouble();
        double n2 = leia.nextDouble();


        switch (op)
        {
            case "+":
                result = calc.soma(n1,n2);
                break;
            case "-":
                result = calc.sub(n1,n2);
                break;
            case "*":
                result = calc.mult(n1,n2);
                break;
            case "/":
                result = calc.div(1,2);
                break;
            case"%":
                result = calc.mod(n1,n2);
                break;
            default:
                System.out.println("nenhum operador foi selecionado");
                break;
        }
        System.out.println(result);

    }
}
