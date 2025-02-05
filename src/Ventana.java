import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JButton boton;
    private JLabel mensaje;
    private MensajesFortuna mostrarmensaje;


    public Ventana(){
        setTitle("Galletas de la fortuna");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mostrarmensaje = new MensajesFortuna();
        mensaje = new JLabel("Conoce tu fortuna", SwingConstants.CENTER);
        mensaje.setBounds(50, 50, 400, 30);
        add(mensaje);

        boton = new JButton("Descubre tu fortuna");
        boton.setBounds(200, 200, 100, 50);

        add(boton);

        boton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
               String fortunaAleatoria = mostrarmensaje.AbrirGalleta();
               mensaje.setText(fortunaAleatoria);
           }
        });
    }


}
