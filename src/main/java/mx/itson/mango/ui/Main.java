/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.ui;

import mx.itson.mango.entidades.Computadora;
import mx.itson.mango.entidades.Televisión;

/**
 *
 * @author rocta
 */
public class Main {
    
    public static void main(String[] args) {

        Televisión tv = new Televisión("Samsung", "XH256", "Negro", 55, 35);
        Computadora pc = new Computadora("Asus", "Ninja2000", "Blanca", 128, 1024);
        
        System.out.println(tv.encender());
        System.out.println(tv.cambiarVolumen(62));
        
        pc.encender();
        
    }
}
