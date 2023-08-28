package Desafio.Desafio02.desafioMethod;

public class _testedata
{
    public static void main(String[] args)
    {
        Data d1 = new Data();
        Data d2 = new Data();
        d1._ano = 2022;
        d1._mes = 8;
        d1._dia = 2;

        d2._ano = 1930;
        d2._mes = 4;
        d2._dia = 1;

        System.out.println(d1.revelarData());
        System.out.println(d2.revelarData());


    }
}
