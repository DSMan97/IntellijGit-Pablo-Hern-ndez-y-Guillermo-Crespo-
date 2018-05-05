import javax.swing.*;

public class PForm  {

    public PForm(){

    }
    private JPanel panel1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Prubra");
        ventana.setContentPane(new PForm().panel1);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);


    }
}