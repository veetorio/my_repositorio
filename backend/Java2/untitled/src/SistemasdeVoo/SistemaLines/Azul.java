package SistemasdeVoo.SistemaLines;

import SistemasdeVoo.ClasseMãe.*;
import SistemasdeVoo.pseudo_interface.SistemaLines_Main;

import java.util.*;

public class Azul extends ClasseLinesM implements SIstemasdeLines
{

    public Map<Integer, Passageiro> reservaAzul = new HashMap<>();
    public Integer ReservasTot = this.limite;

    @Override
    public void reservas(int assento, Passageiro a)
    {
        reservaAzul.put(assento,a);
    }

    @Override
    public void MostrarPassageiros()
    {
        for (Passageiro p : reservaAzul.values())
        {
            System.out.println("Assento: "+ reservaAzul.keySet() +" => "+ p.getNome() +":"+p.getLugar());
        }
    }
    public boolean vagasAzul()
    {
        if((reservaAzul.isEmpty()) || (reservaAzul.size() <= ReservasTot))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
