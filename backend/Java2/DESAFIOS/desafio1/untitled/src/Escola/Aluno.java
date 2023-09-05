package Escola;

public class Aluno
{
    private String nome;
    private int idade;
    private String matricula;
    Aluno()
    {
        this.nome = "nenhum aluno cadastrado";
        this.idade = 0;
        this.matricula = null;

    }
    Aluno(String _nome,int _idade,int dia,int mes,int ano)
    {
        boolean verify =  (dia <= 31) && (mes <= 12);

        this.nome = _nome;
        this.idade = _idade;
        if (verify)
        {
            this.matricula = dia +"/"+mes+"/"+ano;
        }
        else
        {
            this.matricula = null;
        }
    }
    String setStats()
    {
        return String.format("%s : %d : %s",this.nome,this.idade,this.matricula);
    }
}
