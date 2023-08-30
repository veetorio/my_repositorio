package aulas.aula1.Enum;

public class Enum
{

    public static void main(String[] args)
    {
        Jogador j = new Jogador();
        j.y = 10;
        j.x = 10;

        for(int i = 0;i <=10;i++)
        {
           j.andar(Enum_direc.NORTE);
           j.andar(Enum_direc.LESTE);
        }
        j.movimentarEmXeY();




    }
}
