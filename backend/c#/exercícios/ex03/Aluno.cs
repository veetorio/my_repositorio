using System;

namespace ex03
{
    class Aluno
    {
        public string _nome;
        public double _nota1, _nota2;

        public double media()
        {
            return (_nota1 + _nota2)/2;
        }
        public string verify(double media)
        {
            return media >= 7? "Aprovado":"Reprovado";
        }
        public void mensagem()
        {
            double mediafinal = media();

            string resultado = verify(mediafinal);
            
            Console.WriteLine("O aluno"+" "+_nome+" "+resultado+" com média "+mediafinal);
        }

    



        

    }
}