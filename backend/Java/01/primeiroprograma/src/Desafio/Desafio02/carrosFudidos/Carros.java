package Desafio.Desafio02.carrosFudidos;

public class Carros
{
     private int velocidadeFinal;
    protected void acelerar()
    {
        this.velocidadeFinal += 5;
    }
    protected void frear()
    {
        if (this.velocidadeFinal != 0)
        {
            this.velocidadeFinal -= 5;
        }
    }
    public int getInfo()
    {
        return this.velocidadeFinal;
    }
}
