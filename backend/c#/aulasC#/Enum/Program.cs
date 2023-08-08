namespace Enum;

class Program
{
    // é uma forma de criar uma varíavel que recebe valores restritos ao tipo de varíavel 
    enum Opções {Entrar = 1,Chamar = 2,Logout = 3}
    static void Main(string[] args)
    {
        Console.WriteLine((Opções)2);
    }
}
