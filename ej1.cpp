#include <iostream>
#include <string>

using namespace std;

int main() {

    string nombres[] = {"Juan", "Ana", "Luis"};
    int notas[] = {9, 10, 8};

    string buscar;
    bool encontrado = false;

    cout << "Ingrese nombre: ";
    cin >> buscar;

    for (int i = 0; i < 3; i++) {

        if (nombres[i] == buscar) {
            cout << "Nota: " << notas[i] << endl;
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        cout << "Nombre no encontrado" << endl;
    }

    return 0;
}
