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
        for (int i = 0;i < garagem.size();i++)
        if(model.equals(garagem.get(i).getModelo()))
        {
            garagem.remove(garagem.get(i));
        }
    }


    void mostrarLista()
    {
        for (int i = 0;i < garagem.size();i++)
        {
            System.out.println(garagem.get(i).getNomeMotorista() +" => "+garagem.get(i).getModelo());
        }

    }

    void procurarCarro(String model)
    {
        for (int i = 0;i < garagem.size();i++)
        {
            if (model.equals(garagem.get(i).getModelo())) {
                System.out.println("carro encontrado " + garagem.get(i).getModelo());
                break;
            }
        }

    }
}