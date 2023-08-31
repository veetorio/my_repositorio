package PooAulas.Relacao1p1;
public class Relacao1p1
{
    Aux1p1 motor = new Aux1p1();

    void acelerar()
    {
        motor.fatorInject += 0.4;
    }
    void frear()
    {
        if(motor.fatorInject > 1)
        {
            motor.fatorInject -= 0.4;
        }
    }
    void ligar()
    {
        motor.ligado = true;
    }
    void desliga()
    {
        motor.ligado = false;
    }
    boolean estaLigado()
    {
        return motor.ligado;
    }
}
