Proceso DiferenciaMayorMenor
    Definir N, i, mayor, menor, diferencia Como Entero
    
    Escribir "Ingrese la cantidad de números (N):"
    Leer N
    Dimension lista[N]
	
    Para i <- 0 Hasta N-1 Hacer
        Escribir "Ingrese el número ", i+1, ":"
        Leer lista[i]
    FinPara
	
    mayor <- lista[0]
    menor <- lista[0]
	
    Para i <- 1 Hasta N-1 Hacer
        Si lista[i] > mayor Entonces
            mayor <- lista[i]
        FinSi
        Si lista[i] < menor Entonces
            menor <- lista[i]
        FinSi
    FinPara
	
    diferencia <- mayor - menor
	
    Escribir "El número mayor es: ", mayor
    Escribir "El número menor es: ", menor
    Escribir "La diferencia entre el mayor y el menor es: ", diferencia
FinProceso
