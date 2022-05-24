package Modelo;

public class Persona {
    private int ced;
    private String nombre;
    private String correo;

    public Persona() {
        this.ced = 0;
        this.nombre = "";
        this.correo = "";
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
