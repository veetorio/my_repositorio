namespace ex04;

class Program
{
    static void Main(string[] args)
    {
        Imc imc = new Imc(); 
        Console.WriteLine("Coloque seu peso: ");
        imc._peso = double.Parse(Console.ReadLine());
        Console.WriteLine("Coloque sua Altura: ");
        imc._altura = double.Parse(Console.ReadLine());
        imc.situacao();

        

    }
}
