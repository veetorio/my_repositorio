package Animal;

public class Animal
{
    protected String tipo;
    protected String nome;
    protected int sede = 40;
    protected int fome = 50;

    protected void comer()
    {
        this.fome -= 10;
    }
    protected void beber()
    {
        this.sede -= 10;
    }

    protected String Acao()
    {
        return "executou ação ";
    }
    protected String emitirSom()
    {return "emitiu som";}

}
