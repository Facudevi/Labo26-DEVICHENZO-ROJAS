package alumnado;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> listaNotas1 = new ArrayList<>();
        ArrayList<Float> listaNotas2 = new ArrayList<>();
        ArrayList<Float> listaNotas3 = new ArrayList<>();
        listaNotas1.add(2.5f);
        listaNotas1.add(5f);
        listaNotas1.add(8.5f);
        listaNotas2.add(6f);
        listaNotas2.add(5f);
        listaNotas2.add(7.5f);


        ArrayList<String> contenidos1 = new ArrayList<>();
        ArrayList<String> contenidos2 = new ArrayList<>();
        ArrayList<String> contenidos3 = new ArrayList<>();

        ArrayList<Materia>  listaMaterias1 = new ArrayList<>();
        ArrayList<Materia>  listaMaterias2 = new ArrayList<>();
        ArrayList<Materia>  listaMaterias3 = new ArrayList<>();

        ArrayList<Alumno> inscriptos1 = new ArrayList<>();
        ArrayList<Alumno> inscriptos2 = new ArrayList<>();
        ArrayList<Alumno> inscriptos3 = new ArrayList<>();


        Alumno alumno1 = new Alumno("Juan", "Pérez", LocalDate.of(2005, 5, 15), listaNotas1, listaMaterias1);
        Alumno alumno2 = new Alumno("María", "García", LocalDate.of(2003, 10, 20), listaNotas2, listaMaterias2);

        Materia materia1 = new Materia("Programación Orientada a Objetos", contenidos1, inscriptos1);
        Materia materia2 = new Materia("Base de Datos", contenidos2, inscriptos2);

        materia1.AgregarContenido("Archivos");
        materia1.AgregarContenido("Colecciones y Listas");
        materia2.AgregarContenido("Modelado Entidad-Relación");

        materia1.InscribirAlumno(alumno1);
        materia1.InscribirAlumno(alumno2);
        materia2.InscribirAlumno(alumno1);


        alumno1.AgregarNota(8.5f);
        alumno1.AgregarNota(9);
        alumno1.AgregarNota(3.5f);


        System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Mayor nota: " + alumno1.MayorNota());
        System.out.println("Menor nota: " + alumno1.MenorNota());
        System.out.println("Promedio general: " + alumno1.PromedioNota());

        System.out.println("Materia: " + materia1.getNombre());
        System.out.println("Promedio de edad en la materia: " + materia1.edadMateria());
        materia1.listarAlumnos();


        Alumno alumnoNuevo = new Alumno("Carlos", "Sánchez", LocalDate.of(2000, 1, 1), listaNotas3, listaMaterias3);
        System.out.println("Mayor nota (esperado null): " + alumnoNuevo.MayorNota());
        System.out.println("Promedio (esperado 0.0): " + alumnoNuevo.PromedioNota());

        System.out.println("\n--- Materias de " + alumno1.getNombre() + " ---");
        for (Materia m : alumno1.getListaMaterias()) {
            System.out.println("- " + m.getNombre());
        }
    }
}