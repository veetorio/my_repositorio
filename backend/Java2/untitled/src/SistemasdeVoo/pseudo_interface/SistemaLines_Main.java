package SistemasdeVoo.pseudo_interface;
import SistemasdeVoo.SistemaLines.*;

import java.util.Scanner;

public class SistemaLines_Main
{
    private Azul azul = new Azul();
    private Qatar qatar = new Qatar();
    private Gol gol = new Gol();
    private Scanner leia = new Scanner(System.in);

    void reservarAzul()
    {
        int i = 0;
        if(azul.vagasAzul())
        {
            System.out.println("Deseja fazer quantas reservas ?");
            int reservasVer = Integer.parseInt(leia.next());
            do
            {
                System.out.println("Qual seu Nome :");
                String nome = leia.next();
                System.out.println("Qual seu destino");
                String local = leia.next();
                System.out.println("Qual seu assento");
                int assento = Integer.parseInt(leia.next());
                if (!azul.vagasAzul())
                {
                    Passageiro p = new Passageiro(nome, local);
                    azul.reservaAzul.put(assento, p);
                }else
                {
                    System.out.println("seu assento excede o limite!");
                }
                i++;
            }
            while (i < reservasVer);
        }
        else
        {
            System.out.println("Não há vagas");
        }
    }
    void assentosAzul()
    {
        azul.MostrarPassageiros();
    }

    void reservarGol(int assento,Passageiro a)
    {
        gol.reservas(assento,a);
    }
    void assentosGol()
    {
        gol.MostrarPassageiros();
    }

    void reservarQatar(int assento,Passageiro a)
    {
        qatar.reservas(assento,a);
    }
    void assentosQatar()
    {
        qatar.MostrarPassageiros();
    }

    public int getLimite()
    {
        return azul.ReservasTot;
    }
    boolean vagas()
    {
        return azul.vagasAzul();
    }
}

