package Animal;

public class Bio
{
    public static void main(String[] args)
    {
        Animal a = new Cachorro();

        System.out.println(a.emitirSom());

        a = new Gato();
        System.out.println(a.emitirSom());


    }
}
