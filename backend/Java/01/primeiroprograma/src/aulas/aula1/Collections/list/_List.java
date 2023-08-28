package aulas.aula1.Collections.list;

import java.util.ArrayList;

public class _List
{
    public static void main(String[] args)
    {
        User user = new User();
        User user1 = new User();
        ArrayList lista = new ArrayList<>();

        lista.add(user.nome = "ettore");
        lista.add(user1.nome= "let");

        System.out.println(lista.get(0));
        System.out.println(lista.contains("let"));

    }
}
