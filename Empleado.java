package c2ejercicio2a;

public class Empleado extends C2Ejercicio2A {

    private String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado                                
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
}
