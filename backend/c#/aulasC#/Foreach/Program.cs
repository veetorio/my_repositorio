namespace Foreach;

class Program
{
    //ForEach é um tipo de estrutura derep 
    static void Main(string[] args)
    {
        string[] nomes = { "ettore", "izian", "leticia"};
        Console.WriteLine("pesquise um nome:");
        string sel_nome = Console.ReadLine();
        foreach (string listnome in nomes)
        {
            console.WriteLine(listnome);
        }   
    }
}

