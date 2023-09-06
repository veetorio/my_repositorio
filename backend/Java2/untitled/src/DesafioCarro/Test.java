package DesafioCarro;

public class Test
{
    public static void main(String[] args)
    {
        Garagem g = new Garagem();

        Carro a = new Carro("lud","fiat");
        Carro b = new Carro("ettore","hyundai");
        Carro c = new Carro("Lautora","kwid");

        g.adicionarCarro(a);
        g.adicionarCarro(b);
        g.adicionarCarro(c);

        g.removeCarro("hyundai");
        g.procurarCarro("kwid");
        g.procurarCarro("hyundai");
        g.procurarCarro("fiat");g.mostrarLista();



    }
}
