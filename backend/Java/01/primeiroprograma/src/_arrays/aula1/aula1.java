package _arrays.aula1;

public class aula1
{
    //arrays são estruturas que armazenam mais de um dado e um objeto,arrays são estáticas não pode alterar seu tamanho, A array é ela é de tipagem uniforme, para acessar os elementos da array atráves de valores indexados
    // arrays multidimensionais, são array que guarda outras array array
    public static void main(String[] args)
    {   int[]a = new int[3];
        int[]c = new int[3];
        int[] b = {1,2,3};


        int i;
        double soma = 0;

        a[0] = 10;
        a[1] = 7;
        a[2] = 10;

        for(i=0;i < a.length;i++)
        {
            soma += a[i];
        }
        System.out.println(soma/a.length);
        //foreach é uma estrutura de controle aplicada a arrays que percorrer a array
        for(double nota:b)
        {
            System.out.println(nota);
        }
    }

}
