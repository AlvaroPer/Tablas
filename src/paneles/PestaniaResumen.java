package paneles;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaResumen extends JPanel implements ActionListener {
    JLabel clave, nombre, apellidos, edad, calle, numero, codigoPostal;
    JTextField textClave, textNombre, textApellidos, textEdad, textCalle, textNumero, textCodigoPostal;
    TitledBorder datosPersonales;
    JButton btnAlta, btnBaja;
    DefaultTableModel modeloTabla;
    JPanel panelSuperior, panelCentro, panelInferior;

    private void initGUI() {
        instancias();
        configurarContainer();
        acciones();
    }

    private void acciones() {
        btnAlta.addActionListener(this);
        btnBaja.addActionListener(this);
    }

    public PestaniaResumen(){
        initGUI();
    }

    private void instancias() {
        clave = new JLabel("Clave:");
        nombre = new JLabel("Nombre:");
        apellidos = new JLabel("Apellidos:");
        edad = new JLabel("Edad:");
        calle = new JLabel("Calle:");
        numero = new JLabel("Número:");
        codigoPostal = new JLabel("Código Postal:");
        modeloTabla = new DefaultTableModel();
        textClave = new JTextField();
        textNombre = new JTextField();
        textApellidos = new JTextField();
        textEdad = new JTextField();
        textCalle = new JTextField();
        textCalle = new JTextField();
        textNumero = new JTextField();
        textCodigoPostal = new JTextField();
        datosPersonales = new TitledBorder("Datos");
        btnBaja = new JButton("Dar de Baja");
        btnAlta = new JButton("Dar de Alta");
        panelSuperior = new JPanel();
        panelCentro = new JPanel();
        panelInferior = new JPanel();
    }

    private void configurarContainer() {
        this.setLayout(new BorderLayout());
        this.add(configurarSuperior(),BorderLayout.NORTH);
        this.add(configurarCentro(),BorderLayout.CENTER);
        this.add(configurarInferior(),BorderLayout.SOUTH);
    }

    private JPanel configurarSuperior() {
        String[] columnas = new String[] {
                "CLAVE", "NOMBRE", "APELLIDOS", "EDAD"
        };
        Object[][] datos = new Object[][] {
                {1, "Pepe", "Domingo", 40},
                {2, "Carlos", "Domingo", 40},
                {3, "Marta", "Domingo", 40},
        };
        JTable tabla = new JTable(datos, columnas);
        this.add(new JScrollPane(tabla));
        return panelSuperior;
    }

    private JPanel configurarCentro(){
        panelCentro.setLayout(new GridLayout(7,2,0,5));
        panelCentro.setBorder(datosPersonales);
        panelCentro.add(clave);
        panelCentro.add(textClave);
        panelCentro.add(nombre);
        panelCentro.add(textNombre);
        panelCentro.add(apellidos);
        panelCentro.add(textApellidos);
        panelCentro.add(textApellidos);
        panelCentro.add(edad);
        panelCentro.add(textEdad);
        panelCentro.add(calle);
        panelCentro.add(textCalle);
        panelCentro.add(textCalle);
        panelCentro.add(numero);
        panelCentro.add(textNumero);
        panelCentro.add(codigoPostal);
        panelCentro.add(textCodigoPostal);
        return panelCentro;
    }

    private JPanel configurarInferior(){
        panelInferior.add(btnAlta);
        panelInferior.add(btnBaja);
        return panelInferior;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
