package UI;

import javax.swing.*;
import java.awt.*;

public class PanelIzquierdo extends JPanel {

    JLabel lblIzquierdo, lblNombre, lblEdad, lblNacionalidad;
    JTextField txtEdad, txtNombre, txtAlbum;
    JButton btnGuardar, btnIzquierdo;
    public PanelIzquierdo() {
        lblIzquierdo = new JLabel("Artistas");
        //this.add(etiquetaPanel);

        this.setPreferredSize(new Dimension(200, 200));

        //establecer diagramacion del panel:
        this.setLayout(new GridLayout(5, 2));

        //crear elementos:
        lblNacionalidad = new JLabel("Nacionalidad");
        lblEdad = new JLabel("artista");
        lblNombre = new JLabel("Nombre");
        txtEdad = new JTextField(10);
        txtNombre = new JTextField(10);
        txtAlbum = new JTextField(10);
        btnGuardar = new JButton("Guardar");
        btnIzquierdo = new JButton("Crear artista");

        this.add(lblIzquierdo);
        this.add(btnIzquierdo);
        //this.add(new JLabel(""));   como un enter para las columnas
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblEdad);
        txtEdad.setSize(new Dimension(400, 50));
        this.add(txtEdad);
        this.add(lblNacionalidad);
        this.add(txtAlbum);
        this.add(new JLabel(""));
        this.add(btnGuardar);

    }
}

