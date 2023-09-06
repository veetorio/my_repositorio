package SistemasdeVoo.pseudo_interface;

import SistemasdeVoo.ClasseMãe.ClasseLinesM;
import SistemasdeVoo.SistemaLines.Azul;
import SistemasdeVoo.SistemaLines.Passageiro;

import java.util.Scanner;

public class Main extends ClasseLinesM
{

    public static void main(String[] args)
    {

        Scanner leia = new Scanner(System.in);
        SistemaLines_Main system = new SistemaLines_Main();
        System.out.println("-_-_-_-_-_Seja bem vindo ao Sistema de Voos e Reservas _-_-_-_-_");
        while (true)
        {
            System.out.println("\n _-_-_-Gol-_-_-Azul_-_-_Qatar");
            System.out.println("Escolha sua linhas");
            String opc = leia.next();

            switch (opc.toLowerCase())
            {
                case "azul":
                    System.out.println("Deseja fazer uma reserva ou dados do passageiro");
                    String opcAzul = leia.next();
                    switch (opcAzul.toLowerCase())
                    {
                        case "reserva":
                            system.reservarAzul();
                            break;
                        case "dados":
                            system.assentosAzul();
                            break;
                        default:
                            System.out.println("nenhum foi selecionado");
                            break;
                    }
                    break;
                case "gol":

                    break;
                case"qatar":
                    System.out.println("jaum");
                    break;
            }





            System.out.println("Deseja continuar ?");
            String resposta = leia.next();
            if (!resposta.toLowerCase().equals("sim"))
            {
                break;
            }
        }



    }
}
