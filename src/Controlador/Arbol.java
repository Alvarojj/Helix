
package Controlador;

import Modelo.Vendedor;


public class Arbol {
      private Vendedor raiz;

    public Arbol() {
        raiz = null;
    }

    public void setRaiz(Vendedor raiz) {
        this.raiz = raiz;
    }

    public Vendedor getRaiz() {
        return raiz;
    }
    
    private void Insertar(Vendedor nuevo, Vendedor raiz) {
        if (raiz == null) {
            setRaiz(nuevo);
        } else {
            if (nuevo.getCed()< raiz.getCed()) {
                if (raiz.getIzq()== null) {
                    raiz.setIzq(nuevo);
                } else {
                    Insertar(nuevo, this.raiz.getIzq());
                }
            } else {
                if (raiz.getDer()== null) {
                    raiz.setDer(nuevo);
                } else {
                    Insertar(nuevo, raiz.getDer());
                }
            }
        }
    }

    public void insertar(Vendedor nodo) {
        this.Insertar(nodo, this.raiz);
    }
}
