namespace ex05;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");
        Aluno _aluno = new Aluno();
        _aluno.entrada = Console.ReadLine();
        _aluno.nota1 = 10.0;
        _aluno.nota2 = 4.0;      
        _aluno.mensagem();
    }
}
