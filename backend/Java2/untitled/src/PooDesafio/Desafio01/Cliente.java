package PooDesafio.Desafio01;

import java.util.ArrayList;
import java.util.List;

public class Cliente
{
    Compra c = new Compra();
    List<Compra> compras = new ArrayList<>();

    void addCompra(Compra compra)
    {
        this.compras.add(compra);
    }
    void Soma()
    {
        System.out.println(c.valorFinal());
    }

}
