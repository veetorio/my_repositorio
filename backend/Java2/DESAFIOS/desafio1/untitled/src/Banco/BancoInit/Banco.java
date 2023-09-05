package Banco.BancoInit;

import java.util.Scanner;

public class Banco
{
    Scanner leia = new Scanner(System.in);
    Banco(Usuario user)// construtor com entrada
    {
        System.out.println("digite seu id");
        int _idVerify = leia.nextInt();
        if (_idVerify == user.getId())
        {
            System.out.println("Ola seja bem vindo a seu banco digital: qual a seu primeira ação [Sacar] ou [Verificar]");
            String opc = leia.next().toLowerCase();
            switch(opc)
            {
                case "verificar":
                    saldoVerificar(user);
                    break;
                case "sacar":
                    System.out.println("diga o quanto você quer sacer");
                    double saque = leia.nextDouble();
                    userSacar(saque,user);
                    break;
            }
        }
        else
        {
            System.out.println("Id incorreto");
        }
    }
    public void userSacar(double saque,Usuario u)
    {
        if(saque <= u.getSaldo())
        {
            u.setSaldo(u.getSaldo() - saque);
        }
        else
        {
            System.out.println("é impossivel realizar a operação");
        }
    }
    public String saldoVerificar(Usuario u)
    {
        double verificarSaldo = u.getSaldo();
        String nome = u.getNome();
        int id = u.getId();

        return String.format("Seja bem vindo %s, seu saldo atualmente é de %.2f, e seu id é %d",nome,verificarSaldo,id);
    }
}
