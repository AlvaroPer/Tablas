package paneles;


import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PestaniaAltas extends JPanel implements ActionListener {

    JLabel clave, nombre, apellidos, edad, calle, numero, codigoPostal;
    JTextField textClave, textNombre, textApellidos, textEdad;
    JTextArea textCalle, textNumero, textCodigoPostal;
    TitledBorder datosPersonales, direccion;
    JButton btnDarAlta;
    JPanel panelSuperior, panelCentro, panelInferior;

    private void initGUI() {
        instancias();
        configurarContainer();
        acciones();
    }

    private void acciones() {
        btnDarAlta.addActionListener(this);
    }

    public PestaniaAltas(){
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
        textClave = new JTextField();
        textNombre = new JTextField();
        textApellidos = new JTextField();
        textEdad = new JTextField();
        textCalle = new JTextArea();
        textCalle = new JTextArea();
        textNumero = new JTextArea();
        textCodigoPostal = new JTextArea();
        datosPersonales = new TitledBorder("Datos Personales");
        direccion = new TitledBorder("Dirección");
        btnDarAlta = new JButton("Dar de alta");
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
        panelSuperior.setLayout(new GridLayout(4,2,0,5));
        panelSuperior.setBorder(datosPersonales);
        panelSuperior.add(clave);
        panelSuperior.add(textClave);
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
        panelInferior.add(btnDarAlta);
        return panelInferior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
