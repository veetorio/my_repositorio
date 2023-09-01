package Desafio.Desafio02.Jantar;

public class Comida
{
    private double peso;
    protected Comida(double _peso)
    {
        setPeso(_peso);
    }
    protected double getPeso()
    {
        return this.peso;
    }
    protected void setPeso(double _peso)
    {
        this.peso = _peso;
    }
}
