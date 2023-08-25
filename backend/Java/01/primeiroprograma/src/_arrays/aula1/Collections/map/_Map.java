package _arrays.aula1.Collections.map;

import java.util.HashMap;
import java.util.Map;

public class _Map
{

    public static void main(String[] args)
    {//estrutura composta
        Map<Integer,String> id = new HashMap<>();

        id.put(1,"ettore");
        id.put(2,"Leticia");
        id.put(3,"izi");
        id.put(4,"gg");

        System.out.println(id.get(3));
        System.out.println(id.keySet());
        System.out.println(id.values());
        System.out.println(id.containsValue("ettore"));
        System.out.println(id.size());
        System.out.println(id);


    }


}
