package objetos;

import persona.Restaurador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cuadro {
    private String titulo;
    private String pintor;
    private int anio;
    private int estado;

    public Cuadro(String titulo, String pintor, int anio, int estado){
        this.titulo = titulo;
        this.pintor = pintor;
        this.anio = anio;
        this.estado = Math.min(estado, 10);
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnio(){
        return anio;
    }
    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = Math.min(estado, 10);
    }

    public static void main(String[] args){
        List<Cuadro> inventario = new ArrayList<>();
        inventario.add(new Cuadro("Mona Lisa", "Da Vinci", 1503, 7));
        inventario.add(new Cuadro("Guernica", "Picasso", 1937, 4));
        inventario.add(new Cuadro("Obra Moderna", "Nuevo Artista", 2024, 8));

        List<Restaurador> restauradores = new ArrayList<>();
        restauradores.add(new Restaurador("Elena", "Ramos", 12354576, LocalDate.of(1970, 2, 20), 25));
        restauradores.add(new Restaurador("Carlos", "Sanz", 23542133, LocalDate.of(1999, 12, 18), 3));
        restauradores.add(new Restaurador("Julia", "López", 98309322, LocalDate.of(1981, 8, 11), 19));

        System.out.println("----JORNADA DE RESTAURACION----");
        for (int i=0; i<inventario.size(); i++){
            Restaurador r = restauradores.get(i);
            Cuadro c = inventario.get(i);

            String resultado = r.restaurar(c);
            System.out.println(resultado);
        }
    }
}