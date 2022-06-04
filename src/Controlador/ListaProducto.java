/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class ListaProducto {
    //Atributos 
    Producto ptrProducto;

    //Constructor de la lista;
    public ListaProducto() {
        ptrProducto = null;
    }

    //Crear empleado 
    public Producto crearProducto(int idProducto, String articulo, double precio, int stock) {
        Producto nuevo = new Producto( idProducto,  articulo,  precio,  stock);
        return nuevo;
    }

    //metodo agregar
    public void agregarProducto(Producto nuevo) {
        Producto z;
        if (ptrProducto == null) {
            ptrProducto = nuevo;
        } else {
            z = ptrProducto;
            while (z.getSig() != null) {
                z = z.getSig();
            }
            z.setSig(nuevo);
            nuevo.setAnt(z);
        }
    }


    //Buscar empleado
    public Producto buscarProducto(int codigo) {
        Producto p = null, q = null;
        if (ptrProducto != null) {
            q = ptrProducto;
            while (q != null) {
                if (q.getIdProducto()== codigo) {
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

    //Eliminar
    public void eliminarProducto(int codigo) {
        Producto z, p, q;
        if (ptrProducto != null) {
            if (ptrProducto.getIdProducto()==codigo) {
                p = ptrProducto.getSig();
                if (p == null) {
                    ptrProducto = p;

                } else {
                    ptrProducto = p;
                    ptrProducto.setAnt(null);
                }
                JOptionPane.showMessageDialog(null, "El Producto ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                z = buscarProducto(codigo);
                if (z != null) {
                    if (z.getSig() != null) {
                        p = z.getAnt();
                        q = z.getSig();
                        z.setAnt(null);
                        z.setSig(null);
                        p.setSig(q);
                        q.setAnt(p);
                        JOptionPane.showMessageDialog(null, "El Producto ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        p = z.getAnt();
                        z.setAnt(null);
                        p.setSig(null);
                        JOptionPane.showMessageDialog(null, "El Producto ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Producto no se encuentra en la lista!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //modificar
    public void modificarEmpleado(Producto p, String articulo, double precio, int stock) {
        p.setArticulo(articulo);
        p.setPrecio(precio);
        p.setStock(stock);
    }

    // verificar si es un codigo
    public boolean Escodigo(String cad) {
        if (cad.matches("[0-9]*")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Es un entero para las horas
    public boolean Esentero(String cad) {
        if (cad.matches("[0-9]*")) {
            return (true);
        } else {
            return (false);
        }
    }
  //Verifica si es un número decimal
    public boolean Esdecimal(String cad) {
        if (cad.matches("[0-9]*['.']?[0-9]")) {
            return (true);
        } else {
            return (false);
        }
    }

    //Convertir de coma a punto
    public String convertir_coma(String tarifa) {
        String cad = "";
        int lc = tarifa.length(), i = 0;
        while (i < lc) {
            if (tarifa.charAt(i) == ',') {
                cad = cad + ".";
            } else {
                cad = cad + Character.toString(tarifa.charAt(i));
            }
            i++;
        }
        return (cad);
    }
    //Verfica si es un nombre o apellido

    public boolean Esnombre(String cad) {
        boolean sw = true;
        int lc = cad.length(), i = 0;
        char simbolo;
        while ((i < lc) && (sw)) {
            simbolo = cad.charAt(i);
            if (!(Character.isLetter(simbolo) || Character.isWhitespace(simbolo))) {
                sw = false;
            }
            i++;
        }
        return (sw);
    }
    //Indica si la lista esta vacia o no vacia

    public boolean esvacia() {
        if (ptrProducto == null) {
            return (true);
        } else {
            return (false);
        }
    }

    public Producto getpuntero() {
        return (ptrProducto);
    }
    //Devuelve el tamaño de la lista

    public int contarregistros() {
        Producto q = ptrProducto;
        int n = 0;
        if (ptrProducto != null) {
            while (q != null) {
                n++;
                q = q.getSig();
            }
            return (n);
        } else {
            return (n);
        }
    }   
}
