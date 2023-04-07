/**
 * Plantear la clase Empleado de un comercio en la que cobran su sueldo
de acuerdo a la categoría que poseen (A o B). Ingresar el nombre del
empleado, los años de trabajo en la compañía y su categoría. Calcular
el sueldo sabiendo que la categoría A cobra $650 y la B $450. Por
cada año de antigüedad tienen un plus de $30. Mostrar el resultado. 
 */
package entidad;

public class Empleado {
    private char categoria;
    private String nombre;
    private byte antiguedad;
    private int totalACobrar = 0, sueldoCategoriaA = 650,sueldoCategoriaB = 450, plusAntiguedad = 30 ;
    
    
    public Empleado() {
    }

    public Empleado(char categoria, String nombre, byte antiguedad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        
    }
    
    public void calcularSueldo(){
        
        if(categoria == 'A' || categoria == 'a'){
            totalACobrar = sueldoCategoriaA + antiguedad * plusAntiguedad;
        }else{
            if(categoria == 'B' || categoria == 'b'){
                totalACobrar = sueldoCategoriaB + antiguedad * plusAntiguedad;
            }else{
                System.out.println("La categoria ingresada no esta contemplada en este programa");
            }
        }
        if(categoria == 'A' || categoria == 'a' || categoria == 'B' || categoria == 'b'){
            System.out.println("El importe total a cobrar es: " + totalACobrar);
        }
        
    }
    
}
