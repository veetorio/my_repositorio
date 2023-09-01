package Desafio.Desafio02.Content.Test;
import Desafio.Desafio02.Content.Jogo.Hero;
import Desafio.Desafio02.Content.Jogo.Monster;
import Desafio.Desafio02.Content.Jogo.Player;
public class Jogo
{
    public static void main(String[] args)
    {
        Player p1 = new Hero();
        Player p2 = new Monster();

        p1 = new Monster();
        p2 = new Hero();



        p2.atacar(p1);
        p2.atacar(p1);
        System.out.println(p2.life);

    }
}
