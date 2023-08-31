package Desafio.Desafio02.DesafioMd1.conclusãomd4;

public class Jantar
{
    public static void main(String[] args)
    {
        Pessoa p = new Pessoa("ettore",54);
        Comida comida = new Comida("arroz",0.5);
        Comida comida2 = new Comida("arroz",100);


        System.out.println(p.aprensentar());
        p.Comer(comida);
        p.Comer(comida2);
        System.out.println(p.aprensentar());



    }
}
