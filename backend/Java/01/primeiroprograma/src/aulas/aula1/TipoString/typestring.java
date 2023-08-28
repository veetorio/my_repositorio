package aulas.aula1.TipoString;

import java.nio.charset.StandardCharsets;

public class typestring
{
    public static void main(String[] args)
    {
        String F = "Me de x";
        System.out.println(F.replace("x","papai"));
        System.out.println(F.contains("Me de"));
        System.out.println(F.getBytes(StandardCharsets.UTF_8));
        System.out.println(F.toLowerCase());




    }
}
