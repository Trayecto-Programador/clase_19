/**
 * Confeccionar una clase que represente un empleado.
 * Definir como atributos su nombre y su sueldo.
 * Confeccionar los métodos para la carga,
 * otro para imprimir sus datos y por último uno que imprima un mensaje
 * si debe pagar impuestos (si el sueldo supera a 3000)
 */
package entidades;

public class Empleado {
    //1 - Atributos

    private String nombre;
    private Double sueldo;

    //2 - Metodos 
    //2.1 - Metodos Constructores
    public Empleado() {
    }

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //2.2 - Metodos Accesors
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    private void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    //2.3 - Metodos Personalizados
    public void cargarNombre(String nombre) {
        setNombre(nombre);
    }

    public void cargarSueldo(Double sueldo) {
        setSueldo(sueldo);
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sueldo: " + this.sueldo);
    }

    public void imprimirImpuestos() {
        if (sueldo > 3000) {
            System.out.println("Su sueldo de $ " + this.sueldo + " tributa impuesto");
        } else {
            System.out.println("Su sueldo de $ " + this.sueldo + " No tributa impuesto");
        }
    }
}
