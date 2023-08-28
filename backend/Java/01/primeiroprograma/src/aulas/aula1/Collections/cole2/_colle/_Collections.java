package aulas.aula1.Collections.cole2._colle;

import java.util.HashSet;
import java.util.Set;

public class _Collections
{
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args)
    {
        //Colections são array Mutavél,Tipos
        // Set(conjuto):não ordenado,não indexado;não aceita repetições;
        // list:(lista) indexada,aceita repetição;
        // Map(estrutura composta) chave/valor,chave não aceita repetição,valor aceita repetição;
        // Queue: Implementa fila,first in:first out(fifo)"o primeiro a entrar é o primeiro a sair"
        // Stack: Implementa pilha,(lifo)last in/first out"ultimo a entrar é o primeiro a sair";

        //set não aceita tipos primitivos
        HashSet conjuto = new HashSet();
//
        conjuto.add(1.2);
        conjuto.add(true);
        conjuto.add("oi");
        conjuto.remove("oi");
        System.out.println(conjuto);
        System.out.println(conjuto.contains("oi"));

        Set numsp = new HashSet();
        numsp.add(2);
        numsp.add(4);
        numsp.add(6);

        Set numsprimo = new HashSet();
        numsprimo.add(2);
        numsprimo.add(3);
        numsprimo.add(5);

//        numsprimo.addAll(numsp);
       numsprimo.retainAll(numsp);

        System.out.println(numsprimo);

    }
}
