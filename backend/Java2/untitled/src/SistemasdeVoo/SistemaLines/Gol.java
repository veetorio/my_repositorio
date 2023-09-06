package SistemasdeVoo.SistemaLines;
import SistemasdeVoo.ClasseMãe.*;

import java.util.HashMap;
import java.util.Map;

public class Gol extends ClasseLinesM implements SIstemasdeLines
{
    protected Map<Integer, Passageiro> reservaGol = new HashMap<>();
    public int ReservasTot = this.limite;
    @Override
    public void reservas(int assento, Passageiro a)
    {
        reservaGol.put(assento, a);
    }

    @Override
    public void MostrarPassageiros()
    {
        for (Passageiro p : reservaGol.values())
        {
            System.out.println("Assento: "+ reservaGol.keySet() +" => "+ p.getNome() +":"+p.getLugar());
        }
    }
    public boolean vagasGol()
    {
        if((reservaGol.isEmpty()) || (reservaGol.size() <= ReservasTot))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
