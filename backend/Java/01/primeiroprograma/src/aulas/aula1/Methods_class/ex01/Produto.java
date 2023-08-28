package aulas.aula1.Methods_class.ex01;

public class Produto
{
    public double _preco;
    public String _nome;
    public int _qtd;
    public double desc;

    private double descont(double preco)
    {
        final double desc = 0.05;
        double Fpreco = preco - (preco*desc);
        return Fpreco;
    }
    public void Mostrar()
    {
        System.out.println(_nome);
        System.out.println(_preco);
        System.out.println(_qtd);
        System.out.println(descont(_preco));
    }


}
