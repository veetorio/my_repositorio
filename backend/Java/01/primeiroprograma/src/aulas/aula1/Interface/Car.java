package aulas.aula1.Interface;

public class Car
{
    public static void main(String[] args)
    {
        Buggati b = new Buggati();
        b.acelerar();
        b.acelerar();
        b.acelerar();
        b.acelerar();
        b.acelerar();

        b.ligar();
        System.out.println(b.velocidadeFinal);
    }
}
