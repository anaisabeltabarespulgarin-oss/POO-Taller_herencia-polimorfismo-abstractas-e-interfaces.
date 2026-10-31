/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Ana
 */
public class Camion extends Vehiculo implements Asegurable { 
    private final int ejes; 

    public Camion(String placa, int capacidadKg, int ejes) {
        super(placa, capacidadKg);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    @Override
    public String describir() {
        return super.describir() + ", camión de " + ejes + " ejes";
    }

    @Override
    public double tarifaPorKm() {
        return 3000 + (1000 * ejes);
    }

    @Override
    public double valorSeguro() {
        return 400000.0 * ejes;
    }

    public String costoEnvio(int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
