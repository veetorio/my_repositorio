package Desafio.Desafio02.Content.Jogo;

public class Player
{
    public int life = 100;
    protected int x = 10;
    protected int y = 0;



    public void atacar(Player _player)
    {

        boolean distancia = _player.x == this.x || _player.y == this.y;
        if (distancia)
        {
            this.life -= 10;
        }
    }
}
