package Lambdas.Desafio.Exceçãopersonalizada;

public class ExA extends RuntimeException{
    String atributo;
    public void NumeroException(String nomeAtt){this.atributo = nomeAtt;}

    @Override
    public String getMessage() {
        return String.format("Erro este valor é menor que o permitido",atributo);
    }
}
