package fecha;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;

public class Fecha {
    private  int dia;
    private  int mes;
    private  int anio;
    private ArrayList<String> meses = new ArrayList<>(Arrays.asList(
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    ));
    private ArrayList<String> dias = new ArrayList<>(Arrays.asList(
            "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"
    ));

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }


    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }
    public Fecha(int dia,int mes,int anio){
        this.dia = dia;
        this.mes =mes;
        this.anio = anio;
        this.validar(anio,mes,dia);
    }
    private void validar(int anio ,int mes,int dia){

        try {
            LocalDate.of(anio, mes, dia);

        } catch ( java.time.DateTimeException e) {
            this.dia = 1;
            this.mes = 1;
            this.anio = 1900;
        }
    }
    public  int diaMes(){
        return YearMonth.of(this.anio, this.mes).lengthOfMonth();
    }
    public  void  siguiente(){
        LocalDate fechaOriginal = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate aux = fechaOriginal.plusDays(1);
        this.dia = aux.getDayOfMonth();
        this.mes = aux.getMonthValue();
        this.anio = aux.getYear();
    }
    public  void  anterior(){
        LocalDate fechaOriginal = LocalDate.of(this.anio, this.mes, this.dia);
        LocalDate aux = fechaOriginal.minusDays(1);
        this.dia = aux.getDayOfMonth();
        this.mes = aux.getMonthValue();
        this.anio = aux.getYear();
    }
    public String corto(){
        return this.dia + "-" + this.mes + "-" + this.anio;
    }
    public  String Largo(){
        LocalDate aux = LocalDate.of(this.anio, this.mes, this.dia);
        return dias.get(aux.getDayOfWeek().getValue() - 1) + " " + this.dia + " de "  + meses.get(mes - 1) + " del "+  anio;
    }
    public  boolean igualQue(Fecha fechaComp){
        return (this.dia == fechaComp.getDia() && this.mes == fechaComp.getMes() && this.anio == fechaComp.getAnio());
    }
    public  boolean menorQue(Fecha fechaComp){
        return (this.dia > fechaComp.getDia() && this.mes > fechaComp.getMes() && this.anio > fechaComp.getAnio());
    }
    public  boolean mayorQue(Fecha fechaComp){
        return !(this.dia > fechaComp.getDia() && this.mes > fechaComp.getMes() && this.anio > fechaComp.getAnio());
    }



}