package aulas.aula1.Lambdas;

public class Main{
    public static void main(String[] args)
    {
//        Multiplicar m = new Multiplicar();

//        System.out.println(m.calculo(2,4));
        Calcular soma = (x,y) -> {return x*y;};

        System.out.println(soma.calculo(1,3));


    }
}
