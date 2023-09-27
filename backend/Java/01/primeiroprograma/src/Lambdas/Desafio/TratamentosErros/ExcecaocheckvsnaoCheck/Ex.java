package Lambdas.Desafio.TratamentosErros.ExcecaocheckvsnaoCheck;

public class Ex {
    public static void main(String[] args) {
        try {
            Erro2();
        }catch (Exception a){
            System.out.println("oi");

        }
        Erro1();

    }
    static void Erro1(){
        throw new RuntimeException("erro aqui");
    }static void Erro2() throws Exception{
        throw new Exception("oi,erro aqui");
    }

}
