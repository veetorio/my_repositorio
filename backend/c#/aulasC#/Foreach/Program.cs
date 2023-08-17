namespace Foreach;

class Program
{
    //ForEach é um tipo de estrutura de repetição que percorre uma array e sintaxe no C# é assim
    
    static void Main(string[] args)
    {
        string[] nomes = { "ettore", "izian", "leticia"};
        foreach (string listnome in nomes)
        {
            Console.WriteLine(listnome);
        }   
    }
}

