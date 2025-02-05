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
        setLayout(new BorderLayout());
        mensaje = new JLabel(" ", SwingConstants.CENTER);
        add(mensaje, BorderLayout.CENTER);

        JPanel panelMensaje = new JPanel();
        panelMensaje.add(mensaje);
        add(panelMensaje, BorderLayout.NORTH);

        boton = new JButton("Descubre tu fortuna");
        add(boton, BorderLayout.CENTER);

        add(boton);

        boton.addActionListener(e -> {
            String fortunaAleatoria = mostrarmensaje.AbrirGalleta();
            System.out.println(fortunaAleatoria);
            mensaje.setText(fortunaAleatoria);
            repaint();
        });
    }


}
