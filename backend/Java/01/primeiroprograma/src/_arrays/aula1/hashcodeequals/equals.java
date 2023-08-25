package _arrays.aula1.hashcodeequals;

public class equals
{
    public static void main(String[] args) {
        //equals está presente em todos os objetos retorna um valor boolean,hashcode é um metodo que percorrer rapidamente para eliminar os elementos que respondem a uma condição. retorna um valor int,estrutura hashset
        User user1 = new User();
        user1.email = "vitorio@Gmail.com";
        user1.nome = "Ettore";
        User user2 = new User();
        user2.nome = "Ettore";
        user2.email = "vitorio@gmail.com";

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user2.nome));
    }



}