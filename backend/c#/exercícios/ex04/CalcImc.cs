using System;

namespace ex04
{
    class Imc
    {
        public double _peso,_altura;
        public double Calculo()
        {
            return _peso/_altura*_altura;
        }
        public string estado(double Calculo)
        {
            if( Calculo < 18.5)
            {
                return "Magreza";
            }
            else if(Calculo < 24 )
            {
                return "Normal"; 
            }
            else if(Calculo < 30)
            {
                return "sobrepeso";
            }
            else if(Calculo < 40)
            {
                return "obesidade";
            }
            else if(Calculo >= 40)
            {
                return "obesidade grave";
            }
            else
            {
                return "não existe";
            }
    
        }
        public void situacao()
        {
            double imc = Calculo();
            string result = estado(Calculo());
            Console.WriteLine("Seu imc é "+imc+" e está "+result);
        }

    }
}