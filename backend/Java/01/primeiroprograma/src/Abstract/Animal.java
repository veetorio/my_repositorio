package Abstract;

public abstract class Animal
{
    protected int fome = 100;
    public String ruído(Animal a)
    {
        if(fome == 0){
            return "grunido";
        }
        else{
            return "som";
        }
    }
}
