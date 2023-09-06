package SistemasdeVoo.pseudo_interface;
import SistemasdeVoo.SistemaLines.*;

import java.util.Scanner;

public class SistemaLines_Main
{
    private Azul azul = new Azul();
    private Qatar qatar = new Qatar();
    private Gol gol = new Gol();
    private Scanner leia = new Scanner(System.in);

    void reservarAzul(int assento,Passageiro a)
    {
        if(azul.reservaAzul.size() < azul.ReservasTot)
        {
            azul.reservas(assento,a);
        }
        else
        {
            System.out.println("não há vagas");
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

