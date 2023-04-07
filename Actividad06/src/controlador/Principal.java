/**
 * Crear una clase pasaje y un constructor con parámetros para ingresar
 * dos datos por teclado: el precio de un pasaje y la categoría del
 * pasajero, a saber: M = Menor, A = Adulto, J= Jubilado. Si el pasajero
 * es un menor, se deberá hacer un 25% de descuento, si es un jubilado
 * un 50% de descuento. Mostrar el precio resultante y el método
 * toString.
 */
package controlador;

import entidad.Pasaje;

public class Principal {

    public static void main(String[] args) {
        Pasaje pasaje1 = new Pasaje(1000, 'a');
        Pasaje pasaje2 = new Pasaje(1000, 'm');
        Pasaje pasaje3 = new Pasaje(1000, 'j');
        Pasaje pasaje4 = new Pasaje(1000, 'Z');

        Pasaje[] pasajes = {pasaje1, pasaje2, pasaje3, pasaje4};

        for (Pasaje pasaje : pasajes) {
            pasaje.calcularPasaje();
            if (pasaje.getTotalAbonar() != 0) {
                System.out.println(pasaje);
            }

        }
    }

}
