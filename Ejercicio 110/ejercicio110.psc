Algoritmo ControlarDivisionPorCero
    Definir dividendo, divisor, resultado Como Real
	
    Escribir "Ingrese el dividendo:"
    Leer dividendo
	
    Repetir
        Escribir "Ingrese el divisor (distinto de 0):"
        Leer divisor
    Hasta Que divisor <> 0
	
    resultado <- dividendo / divisor
	
    Escribir "El resultado de la división es:", resultado
FinAlgoritmo
