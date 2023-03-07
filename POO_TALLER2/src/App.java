import Clase1.Movie;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Movie minions=new Movie();
    }
}
//el attributo category solo lo ve la clase movie
//el atributo year solo lo ven los que comparten el mismo paquete como animal y prueba
//el atributo duration lo ven todas la clases ya que es publica, teniendo en cuenta que se importe