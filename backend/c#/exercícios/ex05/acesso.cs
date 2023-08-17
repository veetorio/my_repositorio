
namespace ex05;

class Aluno
{
    private string aluno = "Ettore";
    public string entrada;
    public double nota1,nota2;

    public double media(double nota1,double nota2)
    {
        return (nota1 + nota2)/2;
    }
    public void mensagem()
    {
        
        if (entrada == aluno)
        {
            double _media = media(nota1,nota2);
            Console.WriteLine("Acesso concedido");
            Console.WriteLine("O aluno "+entrada+" teve media "+_media);
        }
        else
        {
            Console.WriteLine("Acesso Negado");
        }
    }
    
}