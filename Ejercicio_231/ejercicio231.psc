Proceso IndicePrimerNegativo
    Definir N, i, indice Como Entero
    Definir lista Como Entero
	
    Escribir "Ingrese la cantidad de números:"
    Leer N
    Dimension lista[N]
    indice <- -1
	
    Escribir "Ingrese los números:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer lista[i]
        Si lista[i] < 0 Y indice = -1 Entonces
            indice <- i
        FinSi
    FinPara
	
    Si indice = -1 Entonces
        Escribir "No hay números negativos en la lista."
    Sino
        Escribir "El primer número negativo está en el índice:", indice
    FinSi
FinProceso
