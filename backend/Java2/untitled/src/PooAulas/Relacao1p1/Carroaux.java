package PooAulas.Relacao1p1;

import java.security.spec.RSAOtherPrimeInfo;

public class Carroaux
{
    public static void main(String[] args)
    {
        Relacao1p1 p = new Relacao1p1();
        Aux1p1 n = new Aux1p1();

        p.ligar();

        System.out.println(p.estaLigado());
        System.out.println(p.motor.giros());
    }
}
