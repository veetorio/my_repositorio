package projeto;

import java.util.Locale;
import java.util.Scanner;

public class _Main
{
    public static void main(String[] args)
    {
        BancoId_Nome Bank = new BancoId_Nome();
        Scanner leia = new Scanner(System.in);
        String resposta;

        System.out.println("Seja bem vindo, a um banco simples e fuleiro");
        System.out.println("Deseja entrar com qual operação:escreva [armazene] ou [verificar id]");

        String opc = leia.nextLine().toLowerCase(Locale.ROOT);

        boolean loop = true;
        while (loop == true)
        {
            System.out.println("Deseja iniciar novamente");
            resposta = leia.nextLine();
            if( resposta.equals("não"))
            {
                break;
            }
            switch (opc)
            {
                case "armazene":
                    Bank.armazene();
                    break;
                case "verificar id":
                    String result = Bank.verificar();
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Nenhum operador foi selecionado");
            }
            System.out.println("deseja continuar: ");


        }



    }
}
