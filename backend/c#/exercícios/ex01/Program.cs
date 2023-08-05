namespace ex01;

class Program
{
    static void Main(string[] args)
    {
        Verify verificacao = new Verify();

        Console.WriteLine("Coloque sua idade:");
        verificacao._idade = int.Parse(Console.ReadLine());
        verificacao.verificado();
        
    }
}
