Proceso NumeroMasFrecuente
    Definir N, i, j, contador, maxFrecuencia, numeroFrecuente Como Entero
    Definir lista Como Entero
	
    Escribir "Ingrese la cantidad de números:"
    Leer N
    Dimension lista[N]
	
    Escribir "Ingrese los números:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer lista[i]
    FinPara
	
    maxFrecuencia <- 0
    numeroFrecuente <- lista[0]
	
    Para i <- 0 Hasta N - 1 Hacer
        contador <- 0
        Para j <- 0 Hasta N - 1 Hacer
            Si lista[i] = lista[j] Entonces
                contador <- contador + 1
            FinSi
        FinPara
        Si contador > maxFrecuencia Entonces
            maxFrecuencia <- contador
            numeroFrecuente <- lista[i]
        FinSi
    FinPara
	
    Escribir "El número más frecuente es:", numeroFrecuente
FinProceso
