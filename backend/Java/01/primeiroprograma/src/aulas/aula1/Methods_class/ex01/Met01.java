package aulas.aula1.Methods_class.ex01;

public class Met01
{
    public static void main(String[] args)
    {
        //relação entre metódo e classe a classe sempre tem que ter nome refêrenciando ao nome do arquivo classe define um blcoco de codígo metodo main é responsavél por encadeada por um bloco de codígo
        // Atributos e metódos = membros de uma classe
        Produto prod = new Produto();
        Produto prod2 = new Produto();

        prod._nome = "notebook";
        prod._preco = 900;
        prod._qtd =  1;

        prod2._nome = "Rtx 2090";
        prod2._preco = 3000.4;
        prod2._qtd = 2;

        prod.Mostrar();
    }
}
