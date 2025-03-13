Proceso SerieArmonica
    Definir N, i Como Entero
    Definir suma Como Real
    Escribir "Ingrese el valor de N:"
    Leer N
    suma <- 0
	
    Para i <- 1 Hasta N Hacer
        suma <- suma + (1 / i)
    FinPara
	
    Escribir "La suma de la serie armónica hasta N es:", suma
FinProceso
