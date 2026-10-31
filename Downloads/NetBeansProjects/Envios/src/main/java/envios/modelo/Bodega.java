/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Ana
 */

public class Bodega implements Asegurable { // <-- Asegúrate de agregar implements Asegurable aquí
    private final String nombre;
    private final int metros;

    public Bodega(String nombre, int metros) {
        this.nombre = nombre;
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetros() {
        return metros;
    }

    @Override
    public double valorSeguro() {
        return metros * 2000.0;
    }
}
