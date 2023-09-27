package Lambdas.Desafio.Exceçãopersonalizada;

public class ExSuppException extends RuntimeException{
    String atributo;


    ExSuppException (String nomeAtt){this.atributo = nomeAtt;}

    @Override
    public String getMessage() {
        return String.format("Erro este valor é vazio",atributo);
    }
}
