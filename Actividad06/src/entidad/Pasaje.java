/**
 * Crear una clase pasaje y un constructor con parámetros para ingresar
dos datos por teclado: el precio de un pasaje y la categoría del
pasajero, a saber: M = Menor, A = Adulto, J= Jubilado. Si el pasajero
es un menor, se deberá hacer un 25% de descuento, si es un jubilado
un 50% de descuento. Mostrar el precio resultante y el método
toString.
 */
package entidad;

public class Pasaje {
    private int precioPasaje;
    private char categoria;
    private double  totalAbonar, descuentoMenor, descuentoJubilado;

    public Pasaje() {
    }

    public Pasaje(int precioPasaje, char categoria) {
        this.precioPasaje = precioPasaje;
        this.categoria = Character.toUpperCase(categoria);
        this.descuentoMenor = 0.25;
        this.descuentoJubilado = 0.5;
    }

    public double getTotalAbonar() {
        return totalAbonar;
    }
    
    public void calcularPasaje(){
        if(categoria == 'A' || categoria == 'J' || categoria == 'M'){
           if(categoria == 'J'){
               totalAbonar = precioPasaje - precioPasaje * descuentoJubilado;
           } else{
               if(categoria == 'M'){
                   totalAbonar = precioPasaje - precioPasaje * descuentoMenor;
               }else{
                   totalAbonar = precioPasaje;
               }
           }
        }else{
            System.out.println("La categoria ingresada no esta contemplada por el programa");
        }
    }

    @Override
    public String toString() {
        return "Total abonar:  " + totalAbonar;
    }
    
}
