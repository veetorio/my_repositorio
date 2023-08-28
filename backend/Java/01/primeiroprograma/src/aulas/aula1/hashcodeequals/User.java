package aulas.aula1.hashcodeequals;

public class User
{
    String nome;
    String email;


    public boolean equals(Object objeto)
    {
        return nome.equals(this.nome);
    }
}
