package Lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class predicate
{
    public static void main(String[] args) {
        Function<Integer,String> f1 = (x) ->  {return  x <= 10 ? "rapaz ele tá sem zap":"meu fi que bulacha";};
        UnaryOperator<String> f2 = (x1) -> {return x1 + " mim dê papai ";};
        UnaryOperator<String> f3 = (x3) -> {return x3 + "rapaz";};

        System.out.println(f1.andThen(f2).andThen(f3).apply(2));
    }
}