/**
 * Crear la clase Artículo en la que me permita ingresar el precio unitario
 * de un producto y la cantidad vendida del mismo. Calcular el importe
 * vendido y la comisión del vendedor (15%). Mostrar los resultados.
 */
package entidad;

public class Articulo {

    private double precioUnitario, cantidad, importeVendido, porcentajeComision, comision;

    public Articulo() {
    }

    public Articulo(double precioUnitario, double cantidad) {
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.importeVendido = 0;
        this.porcentajeComision = 0.15;
        this.comision = 0;
    }

    public void calcularVentas() {
        importeVendido = precioUnitario * cantidad;
        comision = importeVendido * porcentajeComision;

    }

    @Override
    public String toString() {
        return " precioUnitario = " + precioUnitario + ",\n cantidad = " + cantidad + ",\n importeVendido = " + importeVendido + ",\n porcentajeComision = " + porcentajeComision + ",\n comision = " + comision;
    }

}
