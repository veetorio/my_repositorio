package aulas.aula1.Lambdas.Foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("Allan","luan","Londrina","Gustavo","Longinus ");

        a.forEach(nome -> System.out.println(nome + "!!!"));

    }
}
