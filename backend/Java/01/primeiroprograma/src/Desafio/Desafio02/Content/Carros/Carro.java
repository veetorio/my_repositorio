package Desafio.Desafio02.Content.Carros;


public class Carro
{
    protected double velocidadeFinal;
    private final int VELOCIDADE_MAX = 18;

    public void acelerar()
    {
        boolean confirm =  velocidadeFinal < VELOCIDADE_MAX;
        ////\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\/\/\/\/\/\/\
        if(confirm)
        {
            this.velocidadeFinal += 5;
        }
    }
    public void frear()
    {
        boolean confirm = velocidadeFinal != 0;
        if(confirm)
        {
            this.velocidadeFinal -= 5;
        }
    }
    public void Stats()
    {
        System.out.println(this.velocidadeFinal);
    }
}
