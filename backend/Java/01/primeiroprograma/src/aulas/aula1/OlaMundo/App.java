package aulas.aula1.OlaMundo;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {

        Scanner leia = new Scanner(System.in);

        System.out.println("OLA MUNDO");
        var nome = String.valueOf(leia.nextDouble());
        System.out.println(nome);
    }
}
