package SistemasdeVoo.SistemaLines;
import SistemasdeVoo.ClasseMãe.ClasseLinesM;
import SistemasdeVoo.ClasseMãe.SIstemasdeLines;

import java.util.HashMap;
import java.util.Map;

public class Qatar extends ClasseLinesM implements SIstemasdeLines
{

    protected Map<Integer, Passageiro> reservaQatar = new HashMap<>();
    private int ReservasTot = this.limite;
    @Override
    public void reservas(int assento, Passageiro a)
    {
        reservaQatar.put(assento,a);
    }
    @Override
    public void MostrarPassageiros()
    {
        for (int i = 0;i <= reservaQatar.size();i++)
        {
            System.out.println(reservaQatar.keySet()+" ==> "+reservaQatar.values());
        }
    }
    public boolean vagasQatar()
    {
        if((reservaQatar.isEmpty()) || (reservaQatar.size() <= ReservasTot))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
