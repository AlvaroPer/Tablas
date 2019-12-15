import paneles.*;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Container container;
    PestaniaAltas pestaniaAltas;
    PestaniaBajas pestaniaBajas;
    PestaniaModificaciones pestaniaModificaciones;
    PestaniaResumen pestaniaResumen;
    JTabbedPane panelPestanias;

    public void initGUI(){

        instancias();
        configurarContainer();
        this.setSize(new Dimension(350,450));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Tablas");
        this.setVisible(true);
        //this.pack();
    }

    private void configurarContainer() {
        container.add(panelPestanias);
        panelPestanias.addTab("Altas",pestaniaAltas);
        panelPestanias.addTab("Bajas",pestaniaBajas);
        panelPestanias.addTab("Modificaciones",pestaniaModificaciones);
        panelPestanias.addTab("Resumen",pestaniaResumen);
    }

    private void instancias() {
        container = this.getContentPane();
        panelPestanias = new JTabbedPane(SwingConstants.TOP);
        pestaniaAltas = new PestaniaAltas();
        pestaniaBajas = new PestaniaBajas();
        pestaniaModificaciones = new PestaniaModificaciones();
        pestaniaResumen = new PestaniaResumen();
    }
}
