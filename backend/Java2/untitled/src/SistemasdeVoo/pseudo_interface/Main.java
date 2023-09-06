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
            System.out.println("Escolha sua linhas");
            String opc = leia.next();

            switch (opc.toLowerCase())
            {
                case "azul":
                    System.out.println("Deseja fazer alguma reserva ou ver os passageiros ");
                    String opc2 = leia.next();
                    if (opc2.equals("reserva"))
                    {
                        System.out.println("quantas reservas ?");
                        int reserva = Integer.parseInt(leia.next());
                        if(reserva <= system.getLimite())
                        {
                            for(int i = 0;i < reserva;i++)
                            {
                                if(system.vagas() == true)
                                {
                                    System.out.println("Qual seu nome ?:");
                                    String nome = leia.next();
                                    System.out.println("Qual seu destino ?:");
                                    String destino = leia.next();
                                    System.out.println("Qual seu assento");
                                    int assento = Integer.parseInt(leia.next());
                                    Passageiro p = new Passageiro(nome,destino);
                                    system.reservarAzul(assento,p);
                                }
                                else
                                {
                                    System.out.println("não há vagas");
                                    break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("seu assento excede o limite");
                            break;
                        }
                    }
                    else if (opc2.equals("passageiros"))
                    {
                        system.assentosAzul();
                    }
                    break;
                case "gol":
                    System.out.println("let");
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
