/**
 * Un alumno tiene una nota de concepto, otra por evaluación escrita y
 * una tercera de evaluación oral. Ingresar las tres notas y calcular su
 * promedio. Además, se deberá indicar: PROMOCIONADO cuando el
 * promedio sea >= 7, APROBADO si el promedio está comprendido
 * entre >= 4 y <7, o DESAPROBADO cuando el promedio es < 4.
 */
package entidad;

public class Alumno {

    private double notaConceptual, notaEvEscrita, notaOral, promedio;

    public Alumno() {
    }

    public Alumno(int notaConceptual, int notaEvEscrita, int notaOral) {
        this.notaConceptual = notaConceptual;
        this.notaEvEscrita = notaEvEscrita;
        this.notaOral = notaOral;
        this.promedio = 0;
    }

    private void calcularPromedio() {
        promedio = (notaConceptual + notaEvEscrita + notaOral) / 3;
        
    }

    public void estadoPromocion() {
        calcularPromedio();
        if (promedio >= 7) {
            System.out.println("PROMOCIONADO");
        } else {
            if (promedio >= 4 && promedio < 7) {
                System.out.println("APROBADO");
            } else {
                if (promedio < 4) {
                    System.out.println("DESAPROBADO");
                } else{
                    System.out.println("Revise las notas ingresada");
                }

            }

        }
        System.out.println("El promedio obtenido es de: " + promedio + "\n");
    }

}
