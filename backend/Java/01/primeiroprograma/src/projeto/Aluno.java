package projeto;

public class Aluno
{
     private String curso;
     private String nome;
    Aluno(String Onome,String Ocurso)
    {
        this.nome = Onome;
        this.curso = Ocurso;
    }
    String retornarNome()
    {
        return this.nome;
    }
    String retornarCurso()
    {

        return this.curso;
    }



}
