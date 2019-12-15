package utils;

public class Persona {
    String clave, nombre, apellidos, calle;
    int edad, numero, codigoPostal;

    public Persona(String clave, String nombre, String apellidos, String calle, int edad, int numero, int codigoPostal) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calle = calle;
        this.edad = edad;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCalle() {
        return calle;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
