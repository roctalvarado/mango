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
    private Impresora impresora;
    
    public Computadora(String marca, String modelo, String color, int memoriaRAM, int espacioDisco) {
        super(marca, modelo, color);
        this.memoriaRAM = memoriaRAM;
        this.espacioDisco = espacioDisco;
    }
    
    public String dismunuirEspacio(int cantidad) {
        if (cantidad > espacioDisco) {
            return "El tamaño del archivo excede el espacio disponible";
        } else {
            this.espacioDisco -= cantidad;
            return "La cantidad total del espacio actualizado es " + this.espacioDisco;
        }
        /*
        int resultado = this.espacioDisco - cantidad;
        this.espacioDisco = resultado;
        return this.espacioDisco;
        */
    }
    
    @Override
    public double calcularDepreciacion(double precio) {
        return precio * 0.12;
    }
    
}
