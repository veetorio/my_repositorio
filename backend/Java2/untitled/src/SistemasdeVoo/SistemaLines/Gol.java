package SistemasdeVoo.SistemaLines;
import SistemasdeVoo.ClasseMãe.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Gol extends ClasseLinesM implements SIstemasdeLines
{
    protected Map<Integer, Passageiro> reserva = new HashMap<>();
    private int ReservasTot = this.limite;

    @Override
    public void reservas(int assentos,int assento, Passageiro a)
    {
        if(reserva.size() <= 20)
        {
            for (int i = 0;i <= assentos;i++)
            {
                reserva.put(assento,a);
            }
        }
        else
        {
            System.out.println("infelizmente todos os assentos já estão reservados");
        }
    }

    @Override
    public void MostrarPassageiros()
    {
        for (int i = 0;i <= reserva.size();i++)
        {
            System.out.println(reserva.keySet()+" ==> "+reserva.values());
        }
    }
}
