package aulas.aula1.FUnciões.Predicate;

import java.util.function.Consumer;

public class Consome
{
    public static void main(String[] args) {
        Consumer<String> Escreva = (palavra) -> System.out.println(palavra);
        Escreva.accept("10");
    }
}
