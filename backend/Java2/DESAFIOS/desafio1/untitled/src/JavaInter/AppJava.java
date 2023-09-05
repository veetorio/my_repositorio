package JavaInter;
import javax.swing.*;

public class AppJava
{
    static JFrame app = new JFrame("Ola humano");
    
    public static void main(String[] args)
    {
        ImageIcon img = new ImageIcon("JavaInter/Img/6c38edd9-d2f2-4375-9226-db1f0426ad08.png");
        JLabel aceitas = new JLabel(img);
        app.add(aceitas);
        app.setSize(1080, 1920);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
