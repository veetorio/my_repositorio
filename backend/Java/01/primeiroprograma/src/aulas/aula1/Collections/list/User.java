package aulas.aula1.Collections.list;

import java.util.Objects;

public class User
{
    String nome;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome);
    }
}
