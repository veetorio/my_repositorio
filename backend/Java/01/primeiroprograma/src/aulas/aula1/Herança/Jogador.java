package aulas.aula1.Herança;

public class Jogador
{
    private int i = 10;
    int life = 100;
    int x;
    int y;
    boolean atacar(Jogador oponente)
    {
        int deltax = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltax == 0 && deltay == 1)
        {
            this.life -= 10;
            return true;
        }
        else if(deltax == 1 && deltay == 0)
        {
            this.life -= 10;
            return true;
        }
        else
        {
            return false;
        }

    }
}
