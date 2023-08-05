namespace ex03;

class Program
{
    static void Main(string[] args)
    {
        Aluno aluno= new Aluno();   
        Console.WriteLine("Escreva o nome do aluno:");
        aluno._nome = Console.ReadLine();
        Console.WriteLine("Escreva as notas do Aluno: ");
        aluno._nota1 = double.Parse(Console.ReadLine());
        aluno._nota2 = double.Parse(Console.ReadLine());
        aluno.mensagem();

    }
}
