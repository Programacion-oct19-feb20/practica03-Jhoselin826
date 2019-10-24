/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado:
    ingreso de nombres complets del estudiante
ingreso de nota 1 (debe ser entero)
ingreso de nota 2 (debe ser entero)
ingreso del ciclo que cursa el alumno (debe ser cadena)

Luego presentar en pantalla los datos de la siguiente forma:
Informe del Alumno
Nombres Completos:
Ciclo:
Nota 1:
Nota 2:
  */
public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     String nombresCompletos;
     int nota1;
     int nota2;
     String ciclo;
     
     System.out.println("Ingreso de Nombres Completos");
     nombresCompletos = entrada.nextLine();
     System.out.println("Ingreso de Nota 1");
     nota1 = entrada.nextInt();
     System.out.println("Ingreso de Nota 2");
     nota2 = entrada.nextInt();
     entrada.nextLine();
     System.out.println("Ingreso el Ciclo que cursa");
     ciclo = entrada.nextLine();
     
     System.out.printf("Informe del Alumno:\nNombres Completos: %s"
             + "\nCiclo: %s\nNota 1: %d\nNota 2: %d\n", nombresCompletos,
            ciclo, nota1, nota2 );
     
     }
}
