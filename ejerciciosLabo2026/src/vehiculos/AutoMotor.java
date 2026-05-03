package vehiculos;

import java.time.LocalDate;

public class AutoMotor extends Vehiculo{
    private String patente;

    public AutoMotor(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabric, String patente) {
        super(marca, modelo, color, cantRuedas, fechaFabric);
        this.patente = patente;
    }

    public String getPatente(){
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void mostrarD(){
        super.mostrarDatos();
        System.out.println("Patente: " + patente);;
    }
}