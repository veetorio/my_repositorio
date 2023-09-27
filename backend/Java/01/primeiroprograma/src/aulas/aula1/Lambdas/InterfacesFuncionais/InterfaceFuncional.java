package aulas.aula1.Lambdas.InterfacesFuncionais;

import java.util.function.BinaryOperator;

public class InterfaceFuncional
{
    static BinaryOperator<Integer> multi = (a,b) -> (a+b)/2;
    static BinaryOperator<Integer> p = (a,b) -> (a+b)/2;
    public static void main(String[] args) {

        System.out.println(multi.apply(10,20));
        System.out.println(p.apply(10,200));

    }
}
