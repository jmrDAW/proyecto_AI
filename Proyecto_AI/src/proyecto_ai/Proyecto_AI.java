package proyecto_ai;

import java.util.Scanner;

/**
 *
 * @author Juan M. Rube <juan.m.rube@gmail.com>
 * @author JESUS
 */
public class Proyecto_AI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Nombre;
        Nombre = "";

        String Apellidos = "";
        String Localidad = "";
        String Edad = "";
        String Gustos = "";
        int Codigo = 1;
        int GoodBye = 0;

        while (Codigo != GoodBye) {

            System.out.println("¿Cual es tu Nombre?");
            Nombre = teclado.nextLine();

            System.out.println("Pues mi nombre es Asesor Virtual de DAW.");

            System.out.println("¿Cual son tus Apellidos?");
            Apellidos = teclado.nextLine();

            System.out.println("Pues mis Apellidos son I. A.");

            System.out.println("¿Donde vives?");
            Localidad = teclado.nextLine();

            System.out.println("Pues yo vivo en el Lenguaje de la POO.");

            System.out.println("¿Qué edad tienes?");
            Edad = teclado.nextLine();

            System.out.println("Yo recien nací de Java el día 12/11/2021.");

            System.out.println("¿Qué te gusta hacer?");
            Gustos = teclado.nextLine();

            System.out.println("A mi enseñar informática.");

            System.out.println("¿Quieres hacer tu primer programa en Java? Si pulsa 1. No pulsa 0.");
            Codigo = teclado.nextInt();

            if (Codigo == 1) {
                System.out.println("public class MiPrimerPrograma {");
                System.out.println("public static void main(String args []){");
                System.out.println("System.out.println(comilla Mi Primer Programa comilla);} }");
            } else {
                System.out.println("¡GoodBye!");
            }
        }
    }

}
