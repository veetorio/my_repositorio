package aulas.aula1.Herança;

public class Jogo
{
    public static void main(String[] args)
    {
        Monstro m = new Monstro();
        Heroi h = new Heroi();

        m.x = 0;
        m.y = 1;
        m.atacar(h);
        h.atacar(m);

        System.out.println(h.life);





    }
}
