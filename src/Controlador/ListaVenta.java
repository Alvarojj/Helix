
package Controlador;

import Modelo.Venta;
import javax.swing.JOptionPane;

public class ListaVenta {
  //Atributos 
    Venta ptr;

    //Constructor de la lista;
    public ListaVenta() {
        ptr = null;
    }

    //Crear empleado 
    public Venta crearVenta(int idVenta, int cedCliente, int total) {
        Venta nuevo = new Venta( idVenta,  cedCliente,  total);
        return nuevo;
    }

    //metodo agregar
    public void agregarVenta(Venta nuevo) {
        Venta z;
        if (ptr == null) {
            ptr = nuevo;
        } else {
            z = ptr;
            while (z.getAbajo()!= null) {
                z = z.getAbajo();
            }
            z.setAbajo(nuevo);
            nuevo.setArriba(z);
        }
    }


    //Buscar empleado
    public Venta buscarVenta(int codigo) {
        Venta p = null, q = null;
        if (ptr != null) {
            q = ptr;
            while (q != null) {
                if (q.getIdVenta()== codigo) {
                    p = q;
                    q = null;
                } else {
                    q = q.getAbajo();
                }
            }
            return (p);
        } else {
            return (null);
        }
    }

    //Eliminar
    public void eliminarVenta(int codigo) {
        Venta z, p, q;
        if (ptr != null) {
            if (ptr.getIdVenta()==codigo) {
                p = ptr.getAbajo();
                if (p == null) {
                    ptr = p;

                } else {
                    ptr = p;
                    ptr.setArriba(null);
                }
                JOptionPane.showMessageDialog(null, "El Venta ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                z = buscarVenta(codigo);
                if (z != null) {
                    if (z.getAbajo()!= null) {
                        p = z.getArriba();
                        q = z.getAbajo();
                        z.setArriba(null);
                        z.setAbajo(null);
                        p.setAbajo(q);
                        q.setArriba(p);
                        JOptionPane.showMessageDialog(null, "El Venta ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        p = z.getArriba();
                        z.setArriba(null);
                        p.setArriba(null);
                        JOptionPane.showMessageDialog(null, "El Venta ha sido eliminado!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Venta no se encuentra en la lista!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
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
        if (ptr == null) {
            return (true);
        } else {
            return (false);
        }
    }

    public Venta getpuntero() {
        return (ptr);
    }
    //Devuelve el tamaño de la lista

    public int contarregistros() {
        Venta q = ptr;
        int n = 0;
        if (ptr != null) {
            while (q != null) {
                n++;
                q = q.getAbajo();
            }
            return (n);
        } else {
            return (n);
        }
    }  
}
