package Desafio.Desafio02.Content.Test;
import Desafio.Desafio02.Content.Carros.Carro;
import Desafio.Desafio02.Content.Carros.Civic;

public class CarroTeste
{
    public static void main(String[] args)
    {
        Carro civic = new Civic();
        civic.acelerar();
        civic.acelerar();
        civic.frear();


        civic.Stats();


    }
}
