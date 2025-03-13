Proceso ListaOrdenada
    Definir N, i Como Entero
    Definir creciente, decreciente Como Logico
    Definir lista Como Entero
	
    Escribir "Ingrese la cantidad de números:"
    Leer N
    Dimension lista[N]
    creciente <- Verdadero
    decreciente <- Verdadero
	
    Escribir "Ingrese los números:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer lista[i]
    FinPara
	
    Para i <- 0 Hasta N - 2 Hacer
        Si lista[i] < lista[i + 1] Entonces
            decreciente <- Falso
        FinSi
        Si lista[i] > lista[i + 1] Entonces
            creciente <- Falso
        FinSi
    FinPara
	
    Si creciente Entonces
        Escribir "La lista está ordenada de forma creciente."
    Sino Si decreciente Entonces
			Escribir "La lista está ordenada de forma decreciente."
		Sino
			Escribir "La lista no está ordenada."
		FinSi
	Finsi	
FinProceso
