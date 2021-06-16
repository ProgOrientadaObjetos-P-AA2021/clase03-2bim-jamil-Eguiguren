/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre;
        String Apellido;
        int edad;
        double matricula;
         double sueldo;
        String rango;

        int opcion;
        System.out.println("Ingrese (1) Para ingresar un Estudiante\n"
                + "(2) Para ingresar un Docente\n"
                + "(3) Para ingresar un Policia\n");
        opcion = sc.nextInt();
        switch (opcion) {

            case 1:

                System.out.println("Ingrese el nombre del estudiante");
                Nombre = sc.nextLine();

                System.out.println("Ingrese el apellido del estudiante");
                Apellido = sc.nextLine();
                
                System.out.println("Ingrese la edad del estudiante");
                edad = sc.nextInt();
                
                System.out.println("Ingrese la matricula del estudiante");
                matricula = sc.nextDouble();

                Estudiante e = new Estudiante(Nombre, Apellido, edad, matricula);
                System.out.println(e);
                // Un docente hereda de una Persona y adicionalmente tiene 
                // la característia sueldo
                break;
            case 2:
                
                System.out.println("Ingrese el nombre del Docente");
                Nombre = sc.nextLine();

                System.out.println("Ingrese el apellido del Docente");
                Apellido = sc.nextLine();
                
                System.out.println("Ingrese la edad del Docente");
                edad = sc.nextInt();
                
                System.out.println("Ingrese la sueldo del Docente");
                sueldo = sc.nextDouble();

                Docente d = new Docente(Nombre, Apellido, edad, sueldo);
                System.out.println(d);
                break;
            // Un policia hereda de una Persona y adicionalmente tiene 
            // la característia rango
            case 3:
                System.out.println("Ingrese el nombre del Policia");
                Nombre = sc.nextLine();

                System.out.println("Ingrese el apellido del Policia");
                Apellido = sc.nextLine();
                
                System.out.println("Ingrese la edad del Policia");
                edad = sc.nextInt();
                
                System.out.println("Ingrese el Rango del Policia");
                rango = sc.nextLine();
                
                Policia p = new Policia(Nombre, Apellido, edad, rango); // falta implementar
                System.out.println(p);
                break;

        }
    }
}
