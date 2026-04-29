package persona;
import java.time.LocalDate;

public class PersonaP {
    private String nombre, apellido;
    private LocalDate fecha;
    private String direccion;

    public PersonaP (String nombre, String apellido, LocalDate fecha, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.direccion = direccion;
    }

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public LocalDate getFecha() {return fecha;}
    public String getDireccion() {return direccion;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public void imprimirDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.fecha);
        System.out.println("Direccion: " + this.direccion);
    }

    public static void main(String[] args){
        Persona persona1 = new Persona("Camila", 28, "Superi 2001");
        persona1.imprimirDatos();
    }
}