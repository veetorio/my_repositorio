namespace ex02;

class Program
{
    static void Main(string[] args)
    {
        Escolher select = new Escolher();
        Console.WriteLine("Escolha as opcões 1(verificar senha e nick) | 2(ver dados)");
        int opt = int.Parse(Console.ReadLine());

        switch (opt)
        {
            case 1:
                Console.WriteLine("Escreva seu nick : ");
                string nome = Console.ReadLine();
                Console.WriteLine("Escreva sua Senha : ");
                int senha = int.Parse(Console.ReadLine());
                select.Verificar(nome,senha);

                break;

            case 2:
                select.dados();
                break;

        }
 
    }
}
