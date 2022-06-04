/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Modelo.Vendedor;
import Modelo.Venta;

/**
 *
 * @author Alvaro
 */
public class NewMain {


    public static void main(String[] args) {
        //Creando Arbol
        Arbol vendedores = new Arbol();
        
        //Creando vendedor
        Vendedor vendedor1 = new Vendedor(1002135238, "1234", true, 0, "Alvaro", "Alvarojimenez@");
        vendedores.insertar(vendedor1);
        
        Venta venta1 = new Venta(1111, vendedor1.getCed(), 20000);
        vendedor1.agregarVenta(venta1);
        Venta venta2 = new Venta(2222, vendedor1.getCed(), 11122);
        vendedor1.agregarVenta(venta2);
       
        Vendedor vendedor2 = new Vendedor(1005345245, "1234", true, 0, "wiliam", "Wiliam@");
        vendedores.insertar(vendedor2);
        
        Venta venta3 = new Venta(3333, vendedor2.getCed(), 25000);
        vendedor2.agregarVenta(venta3);
       
    }
    
}
