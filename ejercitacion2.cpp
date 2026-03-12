#include <iostream>
#include <string>
#include <vector>
using namespace std;

struct Pelicula {
    string nombre;
    int numSala;
    float precio;
    int cantEntradas;
};


Pelicula buscar(Pelicula horarios[3][4]){
    int dia, hora;
    cout << "--- BUSCAR PELICULA ---" << endl;
    cout << "Seleccione el dia (0:Viernes, 1:Sabado, 2:Domingo): ";
    cin >> dia;
    while (dia != 0 && dia != 1 && dia != 2){
        cout << "Seleccione correctamente: ";
        cin >> dia;
    }
    
    cout << "Seleccione el horario (0:14hs, 1:16hs, 2:20hs, 3:22hs): ";
    cin >> hora;
    while (hora != 0 && hora != 1 && hora != 2 && hora != 3){
        cout << "escribe bien la hora: ";
        cin >> hora;
    }
    
    return horarios[dia][hora];
}


void caro(Pelicula horarios[3][4]){
    string dias[3] = {"Viernes", "Sabado", "Domingo"};
    int horas[4] = {14, 16, 20, 22};
    Pelicula masCaro = horarios[0][0];
    int filaMax = 0;
    int columnaMax = 0;

    for (int i=0; i<3; i++){
        for (int j=1; j<4; j++){
            if (horarios[i][j].precio > masCaro.precio){
                masCaro = horarios[i][j];
                filaMax = i;
                columnaMax = j;
            }
        }
    }
    cout << "El día y el horario de la entrada mas cara de la matriz es el " << 
            dias[filaMax] << " a las " << horas[columnaMax] << "hs." << endl;
}


int entradasVendidas(Pelicula horarios[3][4]){
    int cont=0;
    for (int i=0; i<3; i++){
        for (int j=0; j<4; j++){
            if (horarios[i][j].cantEntradas > 50){
                cont++;
            }
        }
    }
    return cont;
}


float precioProm(Pelicula horarios[3][4]){
    float suma = 0;
    int cont=0;
    for (int i=0; i<3; i++){
        for (int j=2; j<4; j++){
            suma += horarios[i][j].precio;
            cont++;
        }
    }
    return suma/(3*4);
}


int main (){
    Pelicula p1 = {"Frankestein", 2, 100, 50};
    Pelicula p2 = {"El Lobo de Wall Street", 5, 130, 40};
    Pelicula p3 = {"Openheimmer", 7, 120, 43};
    Pelicula p4 = {"Avengers: Doomsday", 3, 200, 53};
    Pelicula p5 = {"Viernes 13", 11, 95, 68};
    Pelicula p6 = {"Mad Max", 8, 75, 67};
    Pelicula p7 = {"Titanic", 1, 150, 49};
    Pelicula p8 = {"Minions 2", 4, 80, 60};
    Pelicula p9 = {"Toy Story 4", 6, 90, 100};
    Pelicula p10 = {"Bastardos Sin Gloria", 9, 105, 59};
    Pelicula p11 = {"IT", 12, 180, 42};
    Pelicula p12 = {"Metegol", 10, 70, 78};

    Pelicula horarios[3][4] = {
        {p1,p2,p3,p4},
        {p5,p6,p7,p8},
        {p9,p10,p11,p12}
    };

    Pelicula especifica = buscar(horarios);
    cout << "La pelicula que busca es: " << especifica.nombre << endl;

    caro(horarios);

    int cant = entradasVendidas(horarios);
    cout << "Hay " << cant << " de funciones que superaron las 50 entradas" << endl;

    float promedio = precioProm(horarios);
    cout << "Promedio de funciones nocturnas: " << promedio << endl;
}