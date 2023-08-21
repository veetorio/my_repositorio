package minha_resolução_desafio01;
import javax.swing.*;

public class desafio01
{
    public static void main(String[] args)
    {
        final int div = 3;

        var salario1 = JOptionPane.showInputDialog("Digite o primeiro salário: ");// entrada do salário 1
        var salario2 = JOptionPane.showInputDialog("Digite o segundo salário: ");// entrada do salário 2
        var salario3 = JOptionPane.showInputDialog("Digite o terceiro salário: ");// entrada do salário 3

        double valor1 = Double.parseDouble(conver(salario1));// utilizando a função conver para converter a "," por "."
        double valor2 = Double.parseDouble(conver(salario2));// utilizando a função conver para converter a "," por "."
        double valor3 = Double.parseDouble(conver(salario3));// utilizando a função conver para converter a "," por "."

        double calc_sal = (valor1+valor2+valor3)/div;
        System.out.println(calc_sal+"R$");
    }
    static String conver(String salário)
    {
       return  salário.replace(",",".");
    }
}
