using System;
namespace aulasC_;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Veetorio");
        
        Aluno ettore = new Aluno();

        ettore.nome = Console.ReadLine();
        ettore.idade = 17;
        
        ettore.mensagem();


    }
}
