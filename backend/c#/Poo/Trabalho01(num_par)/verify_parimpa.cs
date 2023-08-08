using System;

namespace Trabalho01_num_par_;

    class Verify
    {
        public int number_1;
        public string VerifyNumber( int number_1)
        {
            if( number_1 % 2 == 0 )
            {
                return "Par";
            }
            else
            {
                return "Ímpar";
            }
        }
        public void mensagem()
        {
            string resp = VerifyNumber(number_1);
            Console.WriteLine(resp);
        }
        
    }

