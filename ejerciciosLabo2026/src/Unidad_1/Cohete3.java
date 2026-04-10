package Unidad_1;
import java.util.Scanner;

public class Cohete3 {
    private String nombre;
    private int velMax;
    private double largo;
    private double ancho;
    private int cantP;

    public Cohete3(String nombre, int velMax, double largo, double ancho, int cantP){
        this.nombre = nombre;
        this.velMax = velMax;
        this.largo = largo;
        this.ancho = ancho;
        this.cantP = cantP;
    }

    public boolean despegar(){
        if ((cantP >= 2) && (velMax > 25000)){
            return true;
        }
        return false;
    }

    public void activar(){
        int propulsores;
        Scanner input = new Scanner(System.in);
        if (despegar()){
            System.out.println("Ingresar la cantidad de propulsores a activar:");
            propulsores = input.nextInt();
            if (propulsores > cantP){
                System.out.println("Al querer activar más propulsores de los que el cohete tiene, no se ha activado ninguno");
            }
            else {
                for (int i=0; i<propulsores; i++){
                    System.out.println("Propulsor " + (i+1) + " activado");
                }
            }
        }
        else {
            System.out.println("El cohete no logró despegar");
        }
    }

    public double tiempo (double distancia){
        if (distancia <= 0){
            return -1;
        }
        else {
            return (distancia / velMax);
        }
    }

    


}