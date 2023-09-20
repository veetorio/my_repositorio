package Lambdas.Desafio;

import java.math.BigDecimal;
import java.util.function.*;

public class DesafioJava
{
    static Function<Produto,Double> desconto =  (preco) -> preco.preco -= (preco.preco)*(preco.desc);
    static  UnaryOperator<Double> frete = preco -> (preco) >= 3000 ? preco + 100 : preco + 50;
    static UnaryOperator<Double> ImpostoMunicipal = (preco) -> preco >= 2500? preco+=preco*0.085 : preco ;
    static Function<Double,String> arredondando = (preco) -> String.format("%.2f",preco);

    public static void main(String[] args) {

        Produto p = new Produto("ipad",3000,0.085);

        double valFinal = desconto.andThen(frete).andThen(ImpostoMunicipal).apply(p);
        System.out.println(arredondando.apply(p.preco));



    }
}
