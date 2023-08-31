package PooAulas.Relacao1p1.Relacao1pN;

public class Compratest
{
    public static void main(String[] args)
    {
        Compra element = new Compra();
        element.lista.add(new Relacao1pN("ettore",1,4.5));
        element.lista.add(new Relacao1pN("element",2,7));
        System.out.println(element.lista.size());

    }
}
