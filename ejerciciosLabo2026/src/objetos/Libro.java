package objetos;
import fecha.Fecha;
import persona.Persona;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private Persona autor;
    private String isbn;
    private  int cantidadHojas;
    private Fecha fechaPublicacion;

    public  Libro(String nombre, Persona autor, String isbn, int cantidadHojas, Fecha fechaPublicacion){
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }
    public  Libro(Persona autor, String isbn, int cantidadHojas, Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }
    public  Libro(String isbn,int cantidadHojas,Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = new Persona("pepe","sanchez", LocalDate.of(1998, 4, 19),"Bolivia 3555");
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }
    public Persona getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getCantidadHojas() {
        return cantidadHojas;
    }
    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean esMasNuevo(Libro libro){
        return  this.fechaPublicacion.menorQue(libro.fechaPublicacion);
    }

    public  static  void main(String[] args){
        Libro libro = new Libro("jf",30,new Fecha());
        System.out.println(libro.getCantidadHojas());
    }
}