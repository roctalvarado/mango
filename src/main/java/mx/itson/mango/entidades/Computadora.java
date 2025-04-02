/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author rocta
 */
public class Computadora extends DispositivoElectrónico {
    
    private int memoriaRAM;
    private int espacioDisco;
    
    public Computadora(String marca, String modelo, String color, int memoriaRAM, int espacioDisco) {
        super(marca, modelo, color);
        this.memoriaRAM = memoriaRAM;
        this.espacioDisco = espacioDisco;
    }
    
    public int descargarArchivo(int cantidad) {
        int resultado = this.espacioDisco - cantidad;
        this.espacioDisco = resultado;
        return this.espacioDisco;
    }
}
