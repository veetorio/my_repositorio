namespace calculadora 
{
    class Calculadora 
    {
        
        
            static void Main(string[] args)
            {

                double resultado = 0;
                string operação = "";

                Console.WriteLine("calculadora em C#");
                Console.WriteLine(" escolha sua operação : \n + = (soma) \n - = (subtração) \n * = (multiplicação) \n / = (divisão) \n");
                char operation = char.Parse(Console.ReadLine());

                Console.WriteLine("\n");

                Console.WriteLine("Coloque seu primeiro Número: ");
                double num1 = double.Parse(Console.ReadLine());
                Console.WriteLine("Coloque seu segundo número: ");
                double num2 = double.Parse(Console.ReadLine());


                switch (operation) 
                {

                    case '+':
                        resultado = Soma(num1,num2);
                        operação = "Soma é =";
                        break;
                    case '-':
                    resultado = Sub(num1,num2);
                    operação = "subtração é ";
                    break;
                    case '*':
                    resultado = Mult(num1,num2);
                    operação = "A multiplição é";
                    break;
                    case '/':
                    resultado = Div(num1,num2);
                    operação = "A divisão é ";
                    break;
                }
                
            
                Console.WriteLine( operação + resultado);
                Console.ReadKey();



                








                
            }
            
            
           
         

            private static double Soma(double num1, double num2)
            {
                return num1 + num2;



            }
            private static double Sub(double num1, double num2)
            {
                return num1 - num2;



            }
            private static double Mult(double num1, double num2)
            {
                return num1 * num2;
            }
            private static double Div(double num1, double num2)
            {
                return num1 / num2;
            }


    }
    
    
}

