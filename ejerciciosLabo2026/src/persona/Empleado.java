package persona;
import java.time.LocalDate;

public class Empleado extends Persona{
    private int DNI;
    private String pais, provincia, numTel, codPais;
    private int franjaHoraria;

    public Empleado(String nombre, String apellido, LocalDate fecha, String direccion, int DNI, String pais, String provincia, String numTel, String codPais, int franjaHoraria) {
        super(nombre, apellido, fecha, direccion);
        this.DNI = DNI;
        this.pais = pais;
        this.provincia = provincia;
        this.numTel = numTel;
        this.codPais = codPais;
        this.franjaHoraria = franjaHoraria;
    }

    public int getDNI() {
        return DNI;
    }
    public String getPais() {
        return pais;
    }
    public String getNumTel() {
        return numTel;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getCodPais() {
        return codPais;
    }
    public int getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }
    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

}