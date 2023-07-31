namespace programa
{
    class Par_ou_impar
    {
        static void Main(string[] args) 
        {
            int n1;
 
            
            Console.WriteLine("digite um numero:");
            n1 = int.Parse(Console.ReadLine());

            if (n1 > 0 && n1 != 0) 
            {

                Console.WriteLine("o seu número" + n1 + " é positivo e ");
                Console.WriteLine(n1 % 2 == 0 ? "par" : "impar");
            } 
            else if (n1 == 0) 
             {
               Console.WriteLine("o seu número" + n1 + " é neutro e par");

             }
            else
            {
              
                Console.WriteLine("o seu número" + n1 + " é negativo e ");
                Console.WriteLine(n1 % 2 == 0 ? "par" : "impar");
            }
        }
    }

}