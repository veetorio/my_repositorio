package projeto;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class _Main
{
    public static void main(String[] args)
    {
        BancoId_Nome Bank = new BancoId_Nome();
        Scanner leia = new Scanner(System.in);

        boolean loop = true;
        while (loop == true)
        {

            System.out.println("Seja bem vindo, a um banco simples e fuleiro");

            System.out.println("Deseja entrar com qual operação:escreva [armazene],[verificar id] ou [mostrar dados] ");
            String opc = leia.nextLine().toLowerCase();
            switch (opc)
            {
                case "armazene":
                    Bank.Armazene();
                    break;
                case "verificar id":
                    Bank.Verificar();
                    break;
                case "mostrar dados":
                    Bank.Mostrar();
                    break;
                default:
                    System.out.println("Nenhum operador foi selecionado");
                    break;
            }

            System.out.println("Deseja iniciar");
            String resposta = leia.nextLine().toLowerCase();

            if(resposta.equalsIgnoreCase("não")){break;}





        }



    }
}
