using System;
namespace ex01
{
    class Verify
    {
        
        public int _idade;
        public void verificado()
        {
            if ( _idade < 18){Console.WriteLine("Acesso Negado");}
            //
            else{Console.WriteLine("Acesso Permitido");}
        }
    }

}