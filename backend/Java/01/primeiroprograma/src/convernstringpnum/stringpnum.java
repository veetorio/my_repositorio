package convernstringpnum;

import org.w3c.dom.ls.LSOutput;


import javax.swing.*;

public class stringpnum
{
    public static void main(String[] args)
    {
        var num1 = JOptionPane.showInputDialog("digite o 0º: ");//ENTRADA DE VARIÁVEL
        var num2 = JOptionPane.showInputDialog("digite o 2º: ");

        num1 = num1.replace(",",".");// VERIFICAÇÃO E TROCA  DE "," POR "."
        num2 = num2.replace(",", ".");

        double valor1 = Double.parseDouble(num1);
        double valor2 = Double.parseDouble(num2);

        System.out.println(valor1 + valor2);
    }
}
