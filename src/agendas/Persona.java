package agendas;

import java.time.LocalDateTime;

/**
 *
 * @author Nahu
 */
public class Persona {//Representa los datos de una persona
    protected String nombre;
    protected String apellido;
    protected long documento;
    protected LocalDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, long documento, LocalDateTime fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y Setters (Métodos para acceder y modificar los atributos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public LocalDateTime getfechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setfechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override 
    public String toString() { //devuelve una cadena que muestre el nombre,apellido,documento y fecha de nacimiento de la persona.
        return "\n Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Documento: " + documento + "\n" +
                "Fecha de nacimiento: " + fechaDeNacimiento + "\n";
    }
}
