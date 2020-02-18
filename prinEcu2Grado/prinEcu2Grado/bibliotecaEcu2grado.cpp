//BiblioEcu2Grado.cpp : Este archivo contiene la implementaci�n de la biblioteca.
//

#include <math.h>
#include "bibliotecaEcu2Grado.h"

int calcularResultados(double ia, double ib, double ic, double& ox1, double& ox2) {
	double discr;
	int numSolsRes;

	discr = ib * ib - 4 * ia * ic;

	if (discr < 0) {
		numSolsRes = 0;
	}
	if (discr == 0) {
		numSolsRes = 1;
		ox1 = (-ib + sqrt(ib * ib - 4 * ia * ic)) / (2 * ia);
	}
	if (discr > 0) {
		numSolsRes = 2;
		ox1 = (-ib + sqrt(discr)) / (2 * ia);
		ox2 = (-ib - sqrt(discr)) / (2 * ia);
	}
	return numSolsRes;
}