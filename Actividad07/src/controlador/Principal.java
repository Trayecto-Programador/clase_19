/**
 * Crear la clase Artículo en la que me permita ingresar el precio unitario
de un producto y la cantidad vendida del mismo. Calcular el importe
vendido y la comisión del vendedor (15%). Mostrar los resultados.
 */

package controlador;

import entidad.Articulo;

public class Principal {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo(10.65, 10);
        articulo1.calcularVentas();
        System.out.println(articulo1);
    }
}
