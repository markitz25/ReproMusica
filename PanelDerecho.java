package UI;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {


    JLabel lblDerecho, lblNombre, lbllist1, lbllist2;
    JTextField txtNombre;
    JButton btnGuardar, btnLista, btnList1, btnList2;

    JLabel etiquetaaPanel;
    public PanelDerecho() {

        lblDerecho = new JLabel("Lista de Reproduccion");
        //this.add(etiquetaPanel);

        this.setPreferredSize(new Dimension(200, 200));

        //establecer diagramacion del panel:
        this.setLayout(new GridLayout(6, 2));

        //crear elementos:

        lblNombre = new JLabel("Nombre");

        lbllist1 = new JLabel("Lista de reproduccion 1");
        lbllist2 = new JLabel("Lista  de Reproduccion 2");
        btnList1 = new JButton("Lista de Reproduccion 1");
        btnList2 = new JButton("Lista de Reproduccion 2");
        txtNombre = new JTextField(5);

        btnGuardar = new JButton("Guardar");
        btnLista = new JButton("Crear lista de Reproduccion");


        this.add(lblDerecho);
        this.add(new JLabel(""));   //como un enter para las columnas
        this.add(btnLista);
        this.add(new JLabel(""));
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lbllist1);
        this.add(btnList1);

        this.add(lbllist2);
        this.add(btnList2);
        this.add(new JLabel(""));
        this.add(btnGuardar);





    }
}
