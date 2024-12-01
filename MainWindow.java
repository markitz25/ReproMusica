package UI;

import java.awt.*;

public class MainWindow extends javax.swing.JFrame {
    PanelSuperior panelSuperior;
    PanelDerecho panelDerecho;
    PanelIzquierdo panelIzquierdo;
    PanelCentral panelCentral;

    public MainWindow() {


        setSize(800, 600);
        setTitle("Spotify Proyecto");


        panelSuperior = new PanelSuperior();
        panelDerecho = new PanelDerecho();
        panelIzquierdo = new PanelIzquierdo();
        panelCentral = new PanelCentral();


        this.setLayout(new BorderLayout());
        this.add(panelSuperior, BorderLayout.NORTH);
        this.add(panelDerecho, BorderLayout.EAST);
        this.add(panelIzquierdo, BorderLayout.WEST);
        //this.add(panelCentral, BorderLayout.SOUTH);

    }
}
