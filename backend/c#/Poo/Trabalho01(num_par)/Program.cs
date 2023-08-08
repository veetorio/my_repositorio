namespace Trabalho01_num_par_;

class Program
{
    static void Main(string[] args)
    {
        Verify verificar = new Verify();
        Console.WriteLine("Digite um numero: ");
        verificar.number_1 = int.Parse(Console.ReadLine());
        verificar.mensagem();
    }
}
