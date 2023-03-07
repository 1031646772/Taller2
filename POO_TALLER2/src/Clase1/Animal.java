package Clase1;
import java.util.Scanner;
public class Animal{
    static Scanner entrada=new Scanner (System.in);
    //atributos por defecto
    String nombre;
    //atributos publicos
    public int edad;
    //atributos privados
    private int eda;
    //definir metodos
    public void registrarAnimal(String n, int e){
        //cuerpo
        nombre=n;
        edad=e;
    }
    
    public void mostrarAnimal (){
       System.out.println("El nombre de animal es:"+nombre+" y tiene "+edad+" años");
       
    }
    public int duplicarEdad(int Edad){
        int duplicado=edad*2;
        return duplicado;
    }
    public static void main(String []args) {
        Animal tigre=new Animal ();
        
    }
}