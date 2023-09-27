package aulas.aula1.FUnciões.Predicate;

import java.util.function.Predicate;

public class Predicado
{
    static Predicate<Produto> isVerify = (prod) -> (prod._preco + (prod._preco * prod._desconto)) <= 700;
    public static void main(String[] args)
    {
        System.out.println(isVerify.test(new Produto("lapis",500.0,0.2)));

    }
}
