namespace Trabalho02_calculadora_;

class Program
{
    static void Main(string[] args)
    {
        Calculadora calculadora = new Calculadora();
        double result = 0;
        string opera = "";
        Console.WriteLine("Seja Bem vindo a calculadora em C#");
        Console.WriteLine("Selecione 1(Soma) | 2(Subtração) | 3(Multiplicação) | 4(Divisão)");

        int opt = int.Parse(Console.ReadLine()); 

        Console.WriteLine("Coloque os valores que deseja operar: ");
        double num1 = double.Parse(Console.ReadLine());
        double num2 = double.Parse(Console.ReadLine());

        switch (opt)
        {
            case 1:
                opera = "+";
                result = calculadora.Sum(num1,num2);
                break;
            case 2:
                opera = "-";
                result = calculadora.Sub(num1,num2);
                break;
            case 3: 
                opera = "*";
                result = calculadora.Multi(num1,num2);
                break;
            case 4:
                opera = "/";
                result = calculadora.Div(num1,num2);
                break;
            default:
                Console.WriteLine("Nenhum operador foi selecionado");
                break;
        }
        Console.WriteLine(num1+opera+num2+" = "+result);


    }  
}
