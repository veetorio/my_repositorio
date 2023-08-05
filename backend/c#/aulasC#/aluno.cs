using System;


class Aluno
{
    public string nome;
    public int idade;

    string resp = "";

    public void mensagem()
    {
        if (idade >= 18)
        {
            resp = "O aluno já passou da idade de se matricular";

        }
        else
        {
            resp = "aluno tá bem novinho";
        }
        Console.WriteLine(" Ola!! O aluno "+nome+" "+resp);
    }



}