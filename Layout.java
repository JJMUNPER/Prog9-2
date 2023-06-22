package Org.IesLosRemedios.Prog.actividades.actividad2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layout {

    public static void main(String[] args) {

        Layout layout = new Layout();
    }

    Layout (){

        Frame frame1 = new Frame();
        frame1.setBackground(Color.cyan);

        Label nombre = new Label("Nombre:");
        Label contra = new Label("Contraseña:");
        nombre.setBackground(Color.gray);
        contra.setBackground(Color.gray);

        Button cancelar = new Button("Cancelar");
        Button acceder = new Button("Acceder");
        cancelar.setBackground(Color.BLUE);
        acceder.setBackground(Color.blue);

        TextField textoNombre = new TextField();
        TextField textoContra = new TextField();
        textoContra.setSize(100, 200);

        Panel panelSuperior = new Panel();
        panelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelSuperior.add(nombre);
        panelSuperior.add(textoNombre);

        Panel panelCentro = new Panel();
        panelCentro.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelCentro.add(contra);
        panelCentro.add(textoContra);

        Panel panelInferior = new Panel();
        panelInferior.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelInferior.add(cancelar);
        panelInferior.add(acceder);

        frame1.add(panelSuperior, BorderLayout.NORTH);
        frame1.add(panelCentro, BorderLayout.CENTER);
        frame1.add(panelInferior, BorderLayout.SOUTH);

        frame1.setSize(300, 200);
        frame1.setTitle("Login");

        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });

        Dialog dialogo = new Dialog(frame1, "¡Bienvenido!", false);
        dialogo.setLayout(null);
        dialogo.setSize(200, 200);
        Label label1 = new Label("¡Bienvenido!");
        label1.setBounds(20, 20, 100, 100);
        label1.setVisible(true);
        dialogo.add(label1);
        dialogo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialogo.dispose();
            }
        });

        acceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo.setVisible(true);
            }
        });

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText(null);
                textoContra.setText(null);
            }
        });

        frame1.setVisible(true);
    }
}

