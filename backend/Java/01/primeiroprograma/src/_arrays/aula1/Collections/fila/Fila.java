package _arrays.aula1.Collections.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila
{
    public static void main(String[] args)
    {
        Queue<String> fila = new LinkedList<>();
        // Offer e add:  adicionam elementos da fila

        fila.offer("oi");
        fila.add("ala");

        System.out.println(fila.size());

//        System.out.println(fila.poll());
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.element());



    }
}
