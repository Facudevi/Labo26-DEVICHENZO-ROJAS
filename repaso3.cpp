#include <iostream>
using namespace std;

const int N = 5;

void mostrarMatriz(char matriz[N][N])
{
    // TODO: completar esta función para mostrar la matriz en pantalla
    for (int i=0; i<N; i++){
        for (int j=0; j<N; j++){
            cout << matriz[i][j] << " -> ";
        }
        cout << endl;
    }
}

void girarDerecha(char origen[N][N], char destino[N][N])
{
    // TODO: completar esta función para girar la matriz 90 grados a la derecha
}

void limpiarPantalla()
{
    for (int i = 0; i < 30; i++)
    {
        cout << endl;
    }
}

int main()
{
    char matriz[N][N] = {
        {'.', '.', '#', '.', '.'},
        {'.', '#', '#', '#', '.'},
        {'#', '#', '#', '#', '#'},
        {'.', '.', '#', '.', '.'},
        {'.', '.', '#', '.', '.'}};

    char girada[N][N];

    girarDerecha(matriz, girada);

    cout << "Matriz original:\n\n";
    mostrarMatriz(matriz);

    cout << "\nPresionar Enter para girarla...";
    cin.get();

    limpiarPantalla();

    cout << "Matriz girada 90 grados a la derecha:\n\n";
    mostrarMatriz(girada);

    return 0;
}