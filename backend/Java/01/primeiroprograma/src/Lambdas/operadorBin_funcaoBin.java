package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class operadorBin_funcaoBin {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (n1,n2) -> n1 + n2;
        BiFunction<Double,Double,String> resultado = (n1,n2) -> {var y = n1 + n2;return  y < 10 ? "fudido":"LAlau";};

        System.out.println(resultado.apply(5.0,3.0));
        System.out.println(soma.apply(3.5,3.0));
    }
}
