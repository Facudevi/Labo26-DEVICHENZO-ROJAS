package telefonia;
import persona.Empleado;

import java.util.ArrayList;

public class EmpresaTelefonica {
    private ArrayList<Empleado> listaEmp;

    public EmpresaTelefonica(ArrayList<Empleado> listaEmp) {
        this.listaEmp = listaEmp;
    }

    public void registrarLlamada(Empleado empOrigen, Empleado empDestino, int tiempo) {
        if (empOrigen.getPais().equals(empDestino.getPais())){
            Local llamada = new Local(empOrigen, empOrigen.getProvincia(), empDestino, empDestino.getProvincia(), tiempo);
        }



    }




}
