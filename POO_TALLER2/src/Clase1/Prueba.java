package Clase1;
import java.util.Scanner;
public class Prueba {
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) {
        Animal guacamayo=new Animal ();
        Movie titanic=new Movie ();
        System.out.println("Ingrese el nombre del animal");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese la edad del animal");
        int edad=entrada.nextInt();
        guacamayo.registrarAnimal(nombre, edad);//invocar o llamar un metodo
        guacamayo.mostrarAnimal();
        int duplicado=guacamayo.duplicarEdad(edad);
        System.out.println("La edad duplicada del animal es:"+duplicado);
    }
}
