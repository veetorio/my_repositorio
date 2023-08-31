package Desafio.Desafio02.DesafioMd1.conclusãomd4;

public class Pessoa
{
    String _nome;
    double _peso;

    Pessoa(String nome,double peso)
    {
        this._nome = nome;
        this._peso = peso;

    }
    void Comer(Comida comida)
    {
        if (comida != null)
        {
            this._peso += comida._pesoc;
        }
    }
    String aprensentar()
    {
        return "Ola eu sou o " + _nome + " e tenho " + _peso +"Kgs.";
    }




    }