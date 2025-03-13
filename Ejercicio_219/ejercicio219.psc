Proceso DiferenciaSumaCuadrados
    Definir N, i, sumaCuadrados, cuadradoSuma, diferencia Como Entero
    Escribir "Ingrese el valor de N:"
    Leer N
    sumaCuadrados <- 0
    cuadradoSuma <- 0
	
    Para i <- 1 Hasta N Hacer
        sumaCuadrados <- sumaCuadrados + (i * i)
        cuadradoSuma <- cuadradoSuma + i
    FinPara
	
    cuadradoSuma <- cuadradoSuma * cuadradoSuma
    diferencia <- cuadradoSuma - sumaCuadrados
	
    Escribir "La diferencia es:", diferencia
FinProceso
