package aulas.aula1.Enum;

public class Jogador
{
    int x;
    int y;

    boolean andar(Enum_direc direction)
    {
       switch (direction)
       {
           case NORTE:
               this.y++;
               break;
           case OESTE:
               this.x++;
               break;
           case LESTE:
               this.x--;
               break;
           case SUL:
               this.y--;
               break;
       }
        return true;

    }
    void movimentarEmXeY()
    {

        System.out.println(this.x+" "+this.y);
    }

}
