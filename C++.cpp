#include <iostream>
using namespace std;

int main() {
    // Variabel
    int angka = 10;

    // Tipe data
    double pi = 3.14;

    // For loop
    for (int i = 0; i < angka; i++) {
        if (i % 2 == 0) {
            cout << i << " adalah bilangan genap." << endl;
        }
    }

    // While loop
    int j = 0;
    while (j < angka) {
        cout << "Ini adalah perulangan while ke-" << j << endl;
        j++;
    }

    // Do-While loop
    int k = 0;
    do {
        cout << "Ini adalah perulangan do-while ke-" << k << endl;
        k++;
    } while (k < angka);

    // Array satu dimensi
    int arrSatuDimensi[5] = {1, 2, 3, 4, 5};

    // Array multidimensi
    int arrMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};

    // Input
    int input;
    cout << "Masukkan sebuah angka: ";
    cin >> input;

    // Output
    cout << "Angka yang Anda masukkan adalah: " << input << endl;

    // Comment
    // Ini adalah contoh komentar dalam C++

    return 0;
}
