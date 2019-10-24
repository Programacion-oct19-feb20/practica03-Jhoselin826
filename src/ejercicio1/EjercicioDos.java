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
public class EjercicioDos {
    /*
    Generara un programa que permita pedir datos por teclado para:
    ingreso de nombres
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de matricula
    
    Lueg presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matrícula:
    */
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombres;
    String ciudadNacimiento;
    int edad;
    double matricula;
    
    System.out.println("Ingrese sus nombres");
    nombres = entrada.nextLine();
    System.out.println("Ingrese su Ciudad de Nacimiento");
    ciudadNacimiento = entrada.nextLine();
    System.out.println("Ingrese su Edad");
    edad = entrada.nextInt(); //Ingreso de enteros
    System.out.println("Ingrese su valor de Matrícula");
    matricula = entrada.nextDouble(); //ingreso de decimales
    
    System.out.printf("Datos Personales:\nNombres: %s\nCiudad de Nacimiento: %s"
            + "\nEdad: %d\nMatrícula: %.3f\n", nombres, ciudadNacimiento, edad,
            matricula);
     }
}
