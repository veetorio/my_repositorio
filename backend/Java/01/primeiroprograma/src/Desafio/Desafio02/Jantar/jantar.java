package Desafio.Desafio02.Jantar;

public class jantar
{
    public static void main(String[] args)
    {
        Pessoa p = new Pessoa(50);
        Comida arroz = new Arroz(0.5);
        Comida feijão = new Feijao(0.4);
        Comida sorvete = new Sorvete(0.2);

        p.comer(arroz);
        p.comer(arroz);
        p.comer(sorvete);
        System.out.println(p.getPeso());
    }
}
