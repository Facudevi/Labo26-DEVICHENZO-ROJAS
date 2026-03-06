#include <iostream>
#include <string>
#include <vector>
using namespace std;


struct Empleado {
    string nombre;
    string apellido;
    string fecha;
    string sexo;
    int salario;
};


Empleado empleadoConMayorSueldo(vector <Empleado> lista, vector <Empleado> &salarioMin){
    Empleado empMayor = lista[0];
    
    for (int i=0; i < lista.size(); i++){
        if (lista[i].salario <= 400000){
            salarioMin.push_back(lista[i]);
        }
    }

    for (int i=1; i < lista.size(); i++){
        if (empMayor.salario < lista[i].salario){
            empMayor = lista[i];
        }
    }

    return empMayor;
}


int main (void){
    Empleado emp1;
    Empleado emp2;
    Empleado emp3;
    Empleado emp4;
    Empleado emp5;
    vector <Empleado> lista;
    vector <Empleado> salarioMin;
    
    emp1.nombre = "Facundo";
    emp1.apellido = "Diaz";
    emp1.fecha = "17/7/1997";
    emp1.sexo = "Masculino";
    emp1.salario = 345545;
    lista.push_back(emp1);

    emp2.nombre = "Camila";
    emp2.apellido = "Sanchez";
    emp2.fecha = "10/1/1988";
    emp2.sexo = "Femenino";
    emp2.salario = 495590;
    lista.push_back(emp2);

    emp3.nombre = "Leonel";
    emp3.apellido = "Gomez";
    emp3.fecha = "28/4/2001";
    emp3.sexo = "Masculino";
    emp3.salario = 249000;
    lista.push_back(emp3);

    emp4.nombre = "Esteban";
    emp4.apellido = "Vazquez";
    emp4.fecha = "1/5/1990";
    emp4.sexo = "Masculino";
    emp4.salario = 399999;
    lista.push_back(emp4);

    emp5.nombre = "Micaela";
    emp5.apellido = "Fernandez";
    emp5.fecha = "6/11/2000";
    emp5.sexo = "Femenino";
    emp5.salario = 450002;
    lista.push_back(emp5);

    cout << "Empleado con el mayor salario:" << endl;
    Empleado mayor = empleadoConMayorSueldo(lista, salarioMin);
    cout << mayor.nombre << " " << mayor.apellido << " - " << mayor.fecha << " - " << mayor.sexo << " - $" << mayor.salario << endl; 
    

    cout << "lista de empleados con salario <= a $400000:" << endl;
    for (int i=0; i < salarioMin.size(); i++){
        cout << salarioMin[i].nombre << " " << salarioMin[i].apellido << " - " << salarioMin[i].fecha << " - " << salarioMin[i].sexo << " - $" << salarioMin[i].salario << endl; 
    }


}