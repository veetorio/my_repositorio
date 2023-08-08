namespace funções;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Chame sua função: 1|2|3 ");
        int opt = int.Parse(Console.ReadLine());
        switch (opt)
        {
            case 1:
                Mensagem();
                break;
            case 2:
                Mensagem2();
                break;
            case 3:
                Console.WriteLine("Coloque um valor");
                int _num1 = int.Parse(Console.ReadLine());
                Console.WriteLine(Mensagem3(_num1));
                break;
        }
    }

    static void Mensagem()
    {
        Console.WriteLine("União Sovietica");
    }
    static void Mensagem2()
    {
        Console.WriteLine("USSR");

    }
    static string Mensagem3(int num1)
    {
        if (num1 % 2 == 0)
        {
            return "é par";
        }
        else
        {
            return "É ìmpar";
        }
    }
}
