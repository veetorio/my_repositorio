using System;

namespace ex02
{
    public class Escolher
    {
        public void Verificar(string _nome,int _senha)
        {
            
            if( _nome == "Ettore" && _senha == 1234 || _nome == "ettore" && _senha == 1234)
            {
                Console.WriteLine("Acesso concedido \ndotSeja bem vindo "+_nome);
            }
            else
            {
                if(_nome != "ettore")
                {
                    Console.WriteLine("O nick está incorreto ");
                }
                else if (_senha != 1234)
                {
                    Console.WriteLine("A senha está incorreto");
                }
            }
            
        
        }
        public void dados()
        {
            string nome = "Ettore";
            int senha = 1234;

            Console.WriteLine(nome+"\n"+senha);

        }
    
    
    
    }
}