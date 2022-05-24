package Modelo;

public class Vendedor extends Persona {
    private double ganancia;
    private String password;
    private boolean activo;
    private Vendedor izq;
    private Vendedor der;
    private Venta ptr_Abajo;
    private Cliente primer_Cliente;
    private Cliente ultimo_Cliente;

    public Vendedor() {
        this.ganancia = 0;
        this.password = "";
        this.activo = false;
        this.izq = null;
        this.der = null;
        this.ptr_Abajo = null;
        this.primer_Cliente = null;
        this.ultimo_Cliente = null;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Vendedor getIzq() {
        return izq;
    }

    public void setIzq(Vendedor izq) {
        this.izq = izq;
    }

    public Vendedor getDer() {
        return der;
    }

    public void setDer(Vendedor der) {
        this.der = der;
    }

    public Venta getPtr_Abajo() {
        return ptr_Abajo;
    }

    public void setPtr_Abajo(Venta ptr_Abajo) {
        this.ptr_Abajo = ptr_Abajo;
    }

    public Cliente getPrimerCliente() {
        return primer_Cliente;
    }

    public void setPrimerCliente(Cliente primer_Cliente) {
        this.primer_Cliente = primer_Cliente;
    }

    public Cliente getUltimoCliente() {
        return ultimo_Cliente;
    }

    public void setUltimoCliente(Cliente ultimo_Cliente) {
        this.ultimo_Cliente = ultimo_Cliente;
    }
    
    
    
//============================================================================== METODOS DE OPERACION VENTAS ======================================================================================  
    /*    
    // Creacion del objeto venta
    public Venta crear_venta(int cedCliente, Producto productos[], int total) {
        Venta nuevo = new Venta();
        nuevo.setCedCliente(cedCliente);
        nuevo.setProductos(productos);
        nuevo.setTotal(total);
        nuevo.setSig(null);
        nuevo.setAnt(null);
        return (nuevo);
    }
    
    // Metodo para registrar una venta
    public void registrar_venta(int cedCliente, Producto productos[], int total) {
        Venta p;
        p = crear_venta(cedCliente, productos, total);
        if (primeraVenta == null && ultimaVenta == null) {
            primeraVenta = p;
            ultimaVenta = p;
        } else {
            ultimaVenta.setSig(p);
            p.setAnt(ultimaVenta);
            ultimaVenta = p;
        }
    }
    
    // Metodo para modificar una venta
    public void modificar_venta(Venta mod, Producto productos[], int total) {
        mod.setProductos(productos);
        mod.setTotal(total);
    }
    
    // Metodo para consultar una venta
    public Venta consultar_venta(int cedCliente) {
        Venta p = null, q = null;
        if (primeraVenta != null) {
            q = primeraVenta;
            while (q != null) {
                if (q.getCedCliente() == cedCliente) {
                    p = q;
                    q = null;
                } else {
                    q = q.getSig();
                }
            }
            return (p);
        } else {
            return (null);
        }
    }
    
    // Metodo para eliminar una venta
    public void eliminar_venta(Venta q) {
        int count = contar_lista_ventas();
        if (count == 1) {
            primeraVenta = null;
            ultimaVenta = null;
        } else {
            if (q == primeraVenta) {
                primeraVenta = q.getSig();
                q.getSig().setAnt(null);
            } else if (q == ultimaVenta) {
                ultimaVenta = q.getAnt();
                q.getAnt().setSig(null);
            } else {
                q.getSig().setAnt(q.getAnt());
                q.getAnt().setSig(q.getSig());
            }
        }
        q.setAnt(null);
        q.setSig(null);
    }
    
    // Contar cuantos nodos hay en la lista
    public int contar_lista_ventas() {
        Venta q = primeraVenta;
        int cont = 0;
        if (primeraVenta != null) {
            while (q != null) {
                cont = cont + 1;
                q = q.getSig();
            }
        }
        return (cont);
    }
    */
//============================================================================== METODOS DE OPERACION INGRESAR CLIENTE ====================================================================================== 
    // Creacion del objeto cliente
    public Cliente crear_cliente(int ced, String nom, String correo, String direccion) {
        Cliente nuevo = new Cliente();
        nuevo.setCed(ced);
        nuevo.setNombre(nom);
        nuevo.setCorreo(correo);
        nuevo.setDireccion(direccion);
        nuevo.setSig(null);
        nuevo.setAnt(null);
        return (nuevo);
    }
    
    // Metodo para registrar un cliente
    public void registrar_cliente(int ced, String nom, String correo, String direccion) {
        Cliente p;
        p = crear_cliente(ced, nom, correo, direccion);
        if (primer_Cliente == null && ultimo_Cliente == null) {
            primer_Cliente = p;
            ultimo_Cliente = p;
        } else {
            ultimo_Cliente.setSig(p);
            p.setAnt(ultimo_Cliente);
            ultimo_Cliente = p;
        }
    }
    
    // Metodo para actualizar un cliente
    public void actualizar_cliente(Cliente mod, String nom, String correo, String direccion) {
        mod.setNombre(nom);
        mod.setCorreo(correo);
        mod.setDireccion(direccion);
    }
    
    // Metodo para consultar un cliente
    public Cliente consultar_cliente(int cedula) {
        Cliente p = null, q = null;
        if (primer_Cliente != null) {
            q = primer_Cliente;
            while (q != null) {
                if (q.getCed() == cedula) {
                    p = q;
                    q = null;
                } else {
                    q = q.getSig();
                }
            }
            return (p);
        } else {
            return (null);
        }
    }
    
    // Contar cuantos nodos hay en la lista
    public int contar_lista_clientes() {
        Cliente q = primer_Cliente;
        int cont = 0;
        if (primer_Cliente != null) {
            while (q != null) {
                cont = cont + 1;
                q = q.getSig();
            }
        }
        return (cont);
    }
}
