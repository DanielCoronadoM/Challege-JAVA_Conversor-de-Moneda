package com.conversor.GUI;

import com.conversor.logic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIconversor extends JFrame{

    String[] currencies = {"Pesos (MXN) a Dolar", "Pesos (MXN) a Euros",
            "Pesos (MXN) a Libras Esterlinas", "Pesos (MXN) a Yen Japonés", "Pesos (MXN) a Won Sur-Coreano",

            "Dolar a Pesos (MXN)","Euros a Pesos (MXN)", "Libras Esterlinas a Pesos (MXN)", "Yen Japonés a Pesos (MXN)",
            "Won Sur-Corenao a Pesos (MXN)"};

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
        btn1.setBounds(100,170,200,20);

        JTextField result = new JTextField();
        result.setBounds(100,250,200,20);





        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Currencies currency = new Currencies();
                result.setText(currency.selectConvertion(currencybox1.getSelectedIndex(), amount.getText()));

            }
        });


        

        // Crea la ventana "Frame" de la aplicacion
        JFrame mainframe = new JFrame();
        mainframe.setTitle("Conversor de Monedas");
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.setLayout(null);  //Desactiva el layout por defecto y dejar mover los elemetos al gusto
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
