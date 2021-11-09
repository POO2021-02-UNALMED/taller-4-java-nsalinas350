package classroom;

public class Persona {

    long cedula;
    static long cedulas;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        cedulas = 0;
    }

    Persona() {
    	this.nombre = "Sin nombre";
    	this.cedula = cedulas++;
        totalPersonas++;
        //cedulas++;
    }
    
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = cedulas++;
        totalPersonas++;
        //cedulas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
