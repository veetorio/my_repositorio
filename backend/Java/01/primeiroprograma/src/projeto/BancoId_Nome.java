package projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BancoId_Nome
{
    Scanner leia = new Scanner(System.in);
    Map<Integer,String > Banco =new HashMap();

    public void Armazene()
    {
        System.out.println("Digite seu nome: ");
        String _nome = leia.nextLine();
        System.out.println("Digite seu id:");
        Integer _id = leia.nextInt();
        Banco.put(_id,_nome);
    }
    public void Verificar()
    {
        System.out.println("coloque sua chave de verificação: ");
        Integer _id = leia.nextInt();
        String  result = Banco.containsKey(_id)? "Seja bem vindo"+ Banco.get(_id):"nenhum usuário encontrado";
        System.out.println(result);
    }

    public void Mostrar()
    {
        System.out.println(Banco);
    }

}
