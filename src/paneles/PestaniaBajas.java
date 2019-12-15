package paneles;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaBajas extends JPanel implements ActionListener {

    JLabel clave, nombre, apellidos, edad, calle, numero, codigoPostal;
    JTextField textClave, textNombre, textApellidos, textEdad;
    JTextArea textCalle, textNumero, textCodigoPostal;
    TitledBorder datosPersonales, direccion, seleccionClave;
    JButton btnDarBaja;
    DefaultComboBoxModel modeloClave;
    JComboBox comboClave;
    JPanel panelSuperior, panelCentro, panelInferior, panelClave;

    private void initGUI() {
        instancias();
        configurarContainer();
        acciones();
    }

    private void acciones() {
        btnDarBaja.addActionListener(this);
    }

    public PestaniaBajas(){
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
        modeloClave = new DefaultComboBoxModel();
        comboClave = new JComboBox(modeloClave);
        textClave = new JTextField();
        textNombre = new JTextField();
        textApellidos = new JTextField();
        textEdad = new JTextField();
        textCalle = new JTextArea();
        textCalle = new JTextArea();
        textNumero = new JTextArea();
        textCodigoPostal = new JTextArea();
        datosPersonales = new TitledBorder("Datos Personales");
        seleccionClave = new TitledBorder("Selección clave");
        direccion = new TitledBorder("Dirección");
        btnDarBaja = new JButton("Dar de alta");
        panelSuperior = new JPanel();
        panelCentro = new JPanel();
        panelInferior = new JPanel();
        panelClave = new JPanel();
    }

    private void configurarContainer() {
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.add(configurarClave());
        this.add(configurarSuperior());
        this.add(configurarCentro());
        this.add(configurarInferior());
    }

    private JPanel configurarClave() {
        panelClave.setLayout(new GridLayout(1,2));
        panelClave.setBorder(seleccionClave);
        panelClave.add(new JLabel("Clave:"));
        panelClave.add(comboClave);
        return panelClave;
    }

    private JPanel configurarSuperior() {
        panelSuperior.setLayout(new GridLayout(3,2,0,5));
        panelSuperior.setBorder(datosPersonales);
        panelSuperior.add(nombre);
        panelSuperior.add(textNombre);
        panelSuperior.add(apellidos);
        panelSuperior.add(textApellidos);
        panelSuperior.add(edad);
        panelSuperior.add(textEdad);
        return panelSuperior;
    }

    private JPanel configurarCentro(){
        panelCentro.setLayout(new GridLayout(3,2,0,5));
        panelCentro.setBorder(direccion);
        panelCentro.add(calle);
        panelCentro.add(textCalle);
        panelCentro.add(numero);
        panelCentro.add(textNumero);
        panelCentro.add(codigoPostal);
        panelCentro.add(textCodigoPostal);
        return panelCentro;
    }

    private JPanel configurarInferior(){
        panelInferior.add(btnDarBaja);
        return panelInferior;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
