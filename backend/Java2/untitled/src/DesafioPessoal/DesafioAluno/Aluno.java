package DesafioPessoal.DesafioAluno;

public class Aluno
{
    String nome;
    String Matricula;
    int idade;

     Aluno(String _nome,int _idade,int dia,int mes,int ano)
     {
         boolean verify = (dia <= 31) && (mes <= 12);
         if(verify)
         {
             this.Matricula = dia+"/"+mes+"/"+ano;
         }
         else
         {
             this.Matricula = "aluno não registrado";
         }

         this.nome = _nome;
         this.idade = _idade;
     }

}
