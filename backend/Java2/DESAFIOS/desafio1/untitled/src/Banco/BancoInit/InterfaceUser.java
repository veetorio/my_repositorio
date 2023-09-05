package Banco.BancoInit;
import Banco.BancoInit.*;
public class InterfaceUser
{
    public static void main(String[] args)
    {
        Usuario u = new Usuario("ettore",5000);

        Banco bank = new Banco(u);

        System.out.println(bank.saldoVerificar(u));


    }
}
