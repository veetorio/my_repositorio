package PooAulas.Relacao1p1;

public class Aux1p1
{
    double fatorInject = 1;
    boolean ligado = false;
    double giros()
    {
        if(!ligado)
        {
            return 0;
        }
        else
        {
            return Math.round(fatorInject * 3000);
        }
    }
    void velocimetro()
    {
        System.out.println(giros());
    }
}
