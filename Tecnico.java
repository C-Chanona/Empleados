package c2ejercicio2a;

public class Tecnico extends Operario{

    /*public Tecnico() {
    }*/

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Técnico");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Técnico";
    }
}