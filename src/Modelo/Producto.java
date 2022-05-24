package Modelo;

public class Producto {
    private int idProducto;
    private String articulo;
    private double precio;
    private int stock;
    private Producto sig;
    private Producto ant;

    public Producto() {
        this.idProducto = 0;
        this.articulo = "";
        this.precio = 0;
        this.stock = 0;
        this.sig = null;
        this.ant = null;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto getSig() {
        return sig;
    }

    public void setSig(Producto sig) {
        this.sig = sig;
    }

    public Producto getAnt() {
        return ant;
    }

    public void setAnt(Producto ant) {
        this.ant = ant;
    }
    
    
}
