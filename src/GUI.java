import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JPanel Dashboard;
    private JPanel Menu;
    private JLabel LabelCurrency1;
    private JLabel LabelCurrency2;
    private JComboBox CurrencyBox1;
    private JComboBox CurrencyBox2;
    private JTextField AmountField1;
    private JButton currencybtn;
    private JButton convertbtn;


    public GUI() { //Constructor
        setContentPane(Dashboard);
        setTitle("Conversor de Monedas");
        setSize(550,700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        convertbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }




    /*private void createUIComponents() {
        // TODO: place custom component creation code here
        String[] currencies = {"Peso Mexicano", "Dolar", "Euro", "Libras Esterlinas", "Yen Japonés", "Won Sur-Coreano"};

        *//*JComboBox Combo1 = new JComboBox(currencies);
        this.add(Combo1);*//*
        //MainMenu.add(Combo1);
    }*/

    public static void main(String[] args) {
        GUI mainmenu = new GUI();
    }
}
