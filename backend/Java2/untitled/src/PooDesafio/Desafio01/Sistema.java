package PooDesafio.Desafio01;

import javax.crypto.spec.PSource;

public class Sistema
{
    public static void main(String[] args)
    {
        Cliente c = new Cliente();
        Compra a = new Compra();

        a.addItens(new Produto("shampoo",45),2);
        a.addItens(new Produto("sacole",100),3);

        System.out.println();



    }
}
