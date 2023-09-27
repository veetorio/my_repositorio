package Lambdas.Desafio.Exceçãopersonalizada;

public class Test {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = null;

        Validar.validar(a);
    }
}
