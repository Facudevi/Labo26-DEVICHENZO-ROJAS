#include <iostream>
#include <string>
#include <vector>
using namespace std;


struct Perro {
    string nombre, direccion, barrio, raza;
    int edad;  
};


void agregar(vector <Perro> &lista){
    Perro pe;
    
    cout << "Nombre del perro: ";
    cin >> pe.nombre;
    cout << "Edad: ";
    cin >> pe.edad;
    cin.ignore();
    cout << "Dirección: ";
    getline(cin, pe.direccion);
    cout << "Barrio: ";
    getline(cin, pe.barrio);
    cout << "Raza: ";
    getline(cin, pe.raza);
    lista.push_back(pe);
}


void verRaza(vector <Perro> lista){
    string razaaa;
    int cont = 0;
    cout << "Ingresar la raza a buscar: ";
    cin.ignore();
    getline(cin, razaaa);

    for(int i=0; i<lista.size(); i++){
        if (lista[i].raza == razaaa){
            cout << lista[i].nombre << " - ";
            cont++;
        }
    }

    if (cont == 0){
        cout << "No se encontró ningun perro de esa raza";
    }
    cout << endl;
}


void verDirec(vector <Perro> lista){
    string nom;
    int cont = 0;
    cout << "Ingresar nombre del perro para verificar dirección: ";
    cin >> nom;

    for(int i=0; i<lista.size(); i++){
        if (lista[i].nombre == nom){
            cout << "La dirección de " << nom << " es: " << lista[i].direccion;
            cont++;
        }
    }

    if (cont == 0){
        cout << "No se encontró ningun perro con ese nombre";
    }
    cout << endl;
}



int main (void){
    int opcion;
    vector <Perro> lista;

    cout << "Elija una opcion\n";
    cout << "1- Añadir perro\n";
    cout << "2- Ver raza específica\n";
    cout << "3- Verificar dirección\n";
    cout << "4- Salir...\n";
    cout << "Opción: ";
    cin >> opcion;

    do {
        switch (opcion){
            case 1:
                agregar(lista);
                break;
            case 2:
                verRaza(lista);
                break;
            case 3:
                verDirec(lista);
                break;
            case 4:
                cout << "Saliendo...\n";
                return 0;
                break;
        }

        cout << "Elija una opcion\n";
        cout << "1- Añadir perro\n";
        cout << "2- Ver raza específica\n";
        cout << "3- Verificar dirección\n";
        cout << "4- Salir...\n";
        cout << "Opción: ";
        cin >> opcion;
        
    } while (opcion >= 1 || opcion <= 4);



}