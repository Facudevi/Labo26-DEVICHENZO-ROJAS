package vehiculos;

import java.time.LocalDate;

public class Bicicleta extends Vehiculo{

    public Bicicleta(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabric) {
        super(marca, modelo, color, cantRuedas, fechaFabric);
    }

    public void verBicicleta(){
        System.out.println("--Bicicleta--");
        super.mostrarDatos();
    }
}