package DesafioCarro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garagem
{

    List<Carro> garagem = new ArrayList();

    void adicionarCarro(Carro c)
    {
        garagem.add(c);
    }
    void removeCarro(String model)
    {
        int i = 0;
        for (Carro c : garagem)
        {
            if (model.equals(c.getModelo())) {
                garagem.remove(garagem.get(i));
            }
        }
        i++;
    }


    void mostrarLista()
    {
        for (Carro c: garagem)
        {
            System.out.println(c.getNomeMotorista() +"=>"+ c.getModelo());
        }

    }

    void procurarCarro(String model)
    {
        for (Carro c : garagem)
        {
            if (model.equals(c.getModelo()))
            {
                System.out.println("carro encontrado " + model);
                break;
            }
        }

    }
}