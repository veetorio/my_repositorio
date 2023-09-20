package Lambdas.Desafio.Exceçãopersonalizada;

public class Validar{
//    private validar(){};
    public static void validar(Aluno a){
        if(a.nome == null || a.nome.trim().isEmpty()){
            throw new ExSuppException("nome");
        }
    }
}
