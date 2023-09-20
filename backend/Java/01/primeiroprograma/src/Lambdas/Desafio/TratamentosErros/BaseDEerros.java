package Lambdas.Desafio.TratamentosErros;

import projeto.Aluno;

public class BaseDEerros {
    public static void main(String[] args) {
//        System.out.println(7/0);
        Aluno a = null;

        try{
            System.out.println(7/0);
        }catch (ArithmeticException NUm){
            System.out.println("erro " + NUm.getMessage());
        }

    }

}
