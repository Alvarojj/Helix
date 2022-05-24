package Modelo;

import java.util.Vector;

public class Venta {

    private int cedCliente;
    private Vector<Producto> productos = new Vector<Producto>();
    private int total;
    private Venta abajo;
    private Venta arriba;

    public Venta() {
        this.cedCliente = 0;
        this.productos = null;
        this.total = 0;
        this.abajo = null;
        this.arriba = null;
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Vector<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Vector<Producto> productos) {
        this.productos = productos;
    }

    public Venta getAbajo() {
        return abajo;
    }

    public void setAbajo(Venta abajo) {
        this.abajo = abajo;
    }

    public Venta getArriba() {
        return arriba;
    }

    public void setArriba(Venta arriba) {
        this.arriba = arriba;
    }

}
