package projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BancoId_Nome
{
    Scanner leia = new Scanner(System.in);
    Map<Integer,String > Banco =new HashMap();

    public void armazene()
    {
        System.out.println("Digite seu nome: ");
        String _nome = leia.nextLine();
        System.out.println("Digite seu id:");
        Integer _id = leia.nextInt();
        Banco.put(_id,_nome);
    }
    public String verificar()
    {
        System.out.println("coloque sua chave de verificação: ");
        int _id = leia.nextInt();
        return "ola";


    }

}
