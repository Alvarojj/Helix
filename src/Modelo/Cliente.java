package Modelo;

public class Cliente extends Persona {
    
    private String direccion;
    private Cliente sig;
    private Cliente ant;

    public Cliente() {
        this.direccion = "";
        this.sig = null;
        this.ant = null;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente getSig() {
        return sig;
    }

    public void setSig(Cliente sig) {
        this.sig = sig;
    }

    public Cliente getAnt() {
        return ant;
    }

    public void setAnt(Cliente ant) {
        this.ant = ant;
    }
    
}
