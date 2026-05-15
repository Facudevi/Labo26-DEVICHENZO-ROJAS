package telefonia;
import persona.Empleado;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private int duracion;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracion = duracion;
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }
    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }
    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}