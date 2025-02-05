import javax.swing.*;

public class Ventana extends JFrame {
    private JButton boton;


    public Ventana(){
        setTitle("Galletas de la fortuna");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        boton = new JButton("Boton");
        boton.setBounds(200, 200, 100, 50);

        add(boton);
    }


}
