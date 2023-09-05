package Banco.BancoInit;
import java.util.Random;
import java.util.random.*;
public class Usuario
{
    // claase simples de um user que
    private String Nome;
    private double Saldo;
    final private int Id;
    final private Random geratorid = new Random();
    Usuario(String nome,double saldo)
    {

        this.Id = geratorid.nextInt(10000);
        System.out.println(this.Id);
        this.Saldo = saldo;
        this.Nome = nome;
    }
    public String getNome()
    {
        return this.Nome;
    }
    public int getId()
    {
        return this.Id;
    }
    public double getSaldo()
    {
        return this.Saldo;
    }
    public void setSaldo(double novoSaldo)
    {
        this.Saldo = novoSaldo;
    }


}
