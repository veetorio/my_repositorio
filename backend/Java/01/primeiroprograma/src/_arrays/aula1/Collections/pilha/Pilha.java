package _arrays.aula1.Collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha
{
    public static void main(String[] args)
    {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno principe");

        System.out.println(livros.peek());
        System.out.println(livros);
        System.out.println( livros.isEmpty());
    }
}
