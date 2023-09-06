package SistemasdeVoo.pseudo_interface;
import SistemasdeVoo.SistemaLines.*;

import java.util.Scanner;

public class SistemaLines_Main
{
    private Azul azul = new Azul();
    private Qatar qatar = new Qatar();
    private Gol gol = new Gol();
    static public int qtd;
    private Scanner leia = new Scanner(System.in);

    void reservarAzul()
    {
        if(vagasAzul())
        {
                    System.out.println("Coloque seu nome: ");
                    String nome = leia.next();
                    System.out.println("Coloque seu destino: ");
                    String local = leia.next();
                    System.out.println("Qual seu assento: ");
                    int assento = Integer.parseInt(leia.next());

                    azul.reservas(assento, new Passageiro(nome, local));
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

    void reservarGol()
    {
        if(vagasGol())
        {
            System.out.println("Coloque seu nome: ");
            String nome = leia.next();
            System.out.println("Coloque seu destino: ");
            String local = leia.next();
            System.out.println("Qual seu assento: ");
            int assentoGol = Integer.parseInt(leia.next());

            gol.reservas(assentoGol, new Passageiro(nome, local));
        }
        else
        {
            System.out.println("não há vagas");
        }
    }
    void assentosGol()
    {
        gol.MostrarPassageiros();
    }

    void reservarQatar()
    {
        if(vagasQatar())
        {
            System.out.println("Coloque seu nome: ");
            String nome = leia.next();
            System.out.println("Coloque seu destino: ");
            String local = leia.next();
            System.out.println("Qual seu assento: ");
            int assentoQatar = Integer.parseInt(leia.next());

            gol.reservas(assentoQatar, new Passageiro(nome, local));
        }
        else
        {
            System.out.println("não há vagas");
        }
    }
    void assentosQatar()
    {
        qatar.MostrarPassageiros();
    }
    public int getLimite()
    {
        return azul.ReservasTot;
    }
    boolean vagasAzul()
    {
        return azul.vagasAzul();
    }
    boolean vagasGol()
    {
        return gol.vagasGol();
    }
    boolean vagasQatar()
    {
        return qatar.vagasQatar();
    }
}

