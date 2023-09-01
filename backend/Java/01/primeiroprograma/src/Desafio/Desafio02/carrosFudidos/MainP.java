package Desafio.Desafio02.carrosFudidos;

public class MainP
{
    public static void main(String[] args)
    {
        Carros civic = new Civic();
        Carros ferrari = new Ferrari();

        civic.acelerar();

        System.out.println(civic.getInfo());



    }
}
