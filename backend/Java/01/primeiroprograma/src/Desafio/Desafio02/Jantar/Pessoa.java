package Desafio.Desafio02.Jantar;

public class Pessoa
{
    private double peso;
    Pessoa(double _peso)
    {
        this.peso = _peso;
    }
    public double getPeso()
    {
        return this.peso;
    }
    void comer(Comida comida)
    {
        this.peso += comida.getPeso();
    }
}
