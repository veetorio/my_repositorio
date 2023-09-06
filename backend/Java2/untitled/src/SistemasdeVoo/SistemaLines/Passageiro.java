package SistemasdeVoo.SistemaLines;


public class Passageiro
{
    private String nome;//nome
    private String lugar;// e destino

    public Passageiro(String _nome,String _lugar)
    {
        this.nome = _nome;
        this.lugar = _lugar;
    }
    String getNome()
    {
        return this.nome;
    }
    String getLugar()
    {
        return this.lugar;
    }

}
