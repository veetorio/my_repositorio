package Desafio.Desafio02.desafioMethod.construtordata;

public class DataClasse
{
    DataClasse (int dia,int mes,int ano)
    {
        System.out.printf("%d/%d/%d",dia,mes,ano);
    }
    DataClasse()
    {
        System.out.println("1/1/1970");
    }
}
