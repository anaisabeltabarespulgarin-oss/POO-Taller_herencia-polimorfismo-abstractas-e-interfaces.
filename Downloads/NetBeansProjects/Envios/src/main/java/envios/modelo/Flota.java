/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;

/**
 *
 * @author Ana
 */
import java.util.ArrayList;

public class Flota {
    private final String nombre;
    private final ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public boolean agregar(Vehiculo vehiculo) {
        if (vehiculo == null || vehiculos.contains(vehiculo)) {
            return false;
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v.describir());
        }
    }

    public int cantidadCamiones() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                contador++;
            }
        }
        return contador;
    }

    public Vehiculo masEconomico(int pesoKg) {
        Vehiculo masEco = null;
        double menorTarifa = Double.MAX_VALUE;

        for (Vehiculo v : vehiculos) {
            if (v.getCapacidadKg() >= pesoKg) {
                if (v.tarifaPorKm() < menorTarifa) {
                    menorTarifa = v.tarifaPorKm();
                    masEco = v;
                }
            }
        }
        return masEco;
    }

    public double totalSeguros() {
        double suma = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Asegurable asegurable) {
                suma += asegurable.valorSeguro();
            }
        }
        return suma;
    }
}