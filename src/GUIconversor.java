import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIconversor extends JFrame{

    String[] currencies = {"Peso (MXN) a Dolar", "Peso (MXN) a Euros",
            "Peso (MXN) a Euro", "Peso (MXN) a Libras Esterlinas",
            "Peso (MXN) a Yen Japonés", "Peso (MXN) a Won Sur-Coreano"};

    public GUIconversor() { //Constructor

        JPanel MenuPanel = new JPanel(); //Panel lateral izquierdo
        MenuPanel.setLayout(null); //Desactivando el Layout por defecto
        MenuPanel.setBackground(new Color(214, 228, 229));
        MenuPanel.setBounds(0,0,150,600);


        JPanel content = new JPanel();
        content.setLayout(null); //Desactivando el Layout por defecto
        content.setBackground(new Color(239, 245, 245));
        content.setBounds(150,0,400,600);


        JLabel tittleLabel = new JLabel();
        CreateLabel(tittleLabel, "Conversor de Divisas", 100,15,200,20); //Metodo para config un label


        JLabel label1 = new JLabel();
        CreateLabel(label1, "Ingrese una cantidad:", 100,65,200,20);

        JTextField amount = new JTextField();
        amount.setBounds(100,85,200,20);


        JComboBox currencybox1 = new JComboBox(currencies);
        currencybox1.setBounds(100, 120,200,30);
        //currencybox1.addItem("op6"); añade items


        JButton btn1 = new JButton();
        btn1.setText("Convertir");
        btn1.setBounds(100,200,200,20);

        JTextField result = new JTextField();
        result.setBounds(100,250,200,20);





        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*LogicsConversor conversor = new LogicsConversor();
                conversor.convert(currencybox1.getSelectedItem(), amount.getText());*/

                result.setText(LogicsConversor.convert(currencybox1.getSelectedIndex(), amount.getText()));
                //LogicsConversor.convert(currencybox1.getSelectedIndex(), amount.getText());


            }
        });


        

        // Crea la ventana "Frame" de la aplicacion
        JFrame mainframe = new JFrame();
        mainframe.setTitle("Conversor de Monedas");
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.setLayout(null);
        mainframe.setSize(550,600);
        mainframe.setVisible(true);
        mainframe.setLocationRelativeTo(null);
        mainframe.setResizable(false);

        mainframe.add(MenuPanel); //Muestra el panel en pantalla
        mainframe.add(content);
        content.add(tittleLabel);
        content.add(btn1);
        content.add(label1);
        content.add(amount);
        content.add(currencybox1);
        content.add(result);


    }

    public void CreateLabel(JLabel p, String text, int x, int y, int w, int h){
        p.setText(text);
        p.setBounds(x,y,w,h);
        p.setHorizontalAlignment(JLabel.CENTER);
        p.setOpaque(false);
        //p.setBackground(Color.GRAY);
    }



}
