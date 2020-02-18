//pralBiblioEcu2Grado.cpp : Este archivo contiene la implementación de la biblioteca.
//
//JUAN MONFORTE LUPIAÑEZ
//
#include <iostream>
#include "bibliotecaEcu2Grado.h"

using namespace std;

double a, b, c;
double x1, x2;

int numSols;



void pedirCoeficientes(double&, double&, double&);

void mostrarResultados(double, double, int, double, double, double);



int main() {

	pedirCoeficientes(a, b, c);

	numSols = calcularResultados(a, b, c, x1, x2);

	mostrarResultados(x1, x2, numSols, a, b, c);
}



void pedirCoeficientes(double& oa, double& ob, double& oc) {
	setlocale(LC_ALL, "");
	do {

		cout << "Input a ";
		cin >> oa;
	} while (a == 0);

	cout << "Input b ";
	cin >> ob;

	cout << "Input c ";
	cin >> oc;

}

void mostrarResultados(double ix1, double ix2, int numSols1, double ia, double ib, double ic) {
	if (numSols1 == 0) {
		cout << "There is no solution." << endl;
	}
	if (numSols1 == 1) {

		cout << "This has one sulution: " << ix1 << endl;
	}
	if (numSols1 == 2) {

		cout << "Has two solutions that are: " << ix1 << " and " << ix2 << endl;
	}
}