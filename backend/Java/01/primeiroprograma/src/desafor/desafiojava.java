package desafor;

public class desafiojava
{
    public static void main(String[] args)
    {
        String chara;
        for(chara = "#";!chara.equalsIgnoreCase("######");chara+= '#')
        {
            System.out.println(chara);
        }


    }
}
