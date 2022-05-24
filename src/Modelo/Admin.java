package Modelo;

public class Admin extends Persona {
    private String password;
    private Producto primer_Producto;
    private Producto ultimo_Producto;

    public Admin() {
        this.password = "";
        this.primer_Producto = null;
        this.ultimo_Producto = null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Producto getPrimerProducto() {
        return primer_Producto;
    }

    public Producto getUltimoProducto() {
        return ultimo_Producto;
    }
    
//============================================================================== METODOS DE OPERACION LISTA DE VENDEDORES ======================================================================================
    
    
    
//============================================================================== METODOS DE OPERACION PRODUCTOS ======================================================================================   
    // Creacion del objeto producto
    public Producto crear_producto(int idProducto, String articulo, double precio, int stock) {
        Producto nuevo = new Producto();
        nuevo.setIdProducto(idProducto);
        nuevo.setArticulo(articulo);
        nuevo.setPrecio(precio);
        nuevo.setStock(stock);
        nuevo.setSig(null);
        nuevo.setAnt(null);
        return (nuevo);
    }
    
    // Metodo para registrar un producto
    public void registrar_producto(int idProducto, String articulo, double precio, int stock) {
        Producto p;
        p = crear_producto(idProducto, articulo, precio, stock);
        if (primer_Producto == null && ultimo_Producto == null) {
            primer_Producto = p;
            ultimo_Producto = p;
        } else {
            ultimo_Producto.setSig(p);
            p.setAnt(ultimo_Producto);
            ultimo_Producto = p;
        }
    }
    
    // Metodo para modificar un producto
    public void modificar_producto(Producto mod, String articulo, double precio, int stock) {
        mod.setArticulo(articulo);
        mod.setPrecio(precio);
        mod.setStock(stock);
    }
    
    // Metodo para consultar un producto
    public Producto consultar_producto(int idProducto) {
        Producto p = null, q = null;
        if (primer_Producto != null) {
            q = primer_Producto;
            while (q != null) {
                if (q.getIdProducto() == idProducto) {
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
    
    // Metodo para eliminar un producto
    public void eliminar_producto(Producto q) {
        int count = contar_lista();
        if (count == 1) {
            primer_Producto = null;
            ultimo_Producto = null;
        } else {
            if (q == primer_Producto) {
                primer_Producto = q.getSig();
                q.getSig().setAnt(null);
            } else if (q == ultimo_Producto) {
                ultimo_Producto = q.getAnt();
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
    public int contar_lista() {
        Producto q = primer_Producto;
        int cont = 0;
        if (primer_Producto != null) {
            while (q != null) {
                cont = cont + 1;
                q = q.getSig();
            }
        }
        return (cont);
    }
}
