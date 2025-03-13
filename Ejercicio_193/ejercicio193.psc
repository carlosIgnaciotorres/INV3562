Proceso EncontrarModa
    Definir N, i, moda, maxFrecuencia Como Entero
    Definir lista, frecuencias Como Arreglo
    Escribir "Ingrese la cantidad de números (N):"
    Leer N
    Dimension lista[N]
    Dimension frecuencias[N]
	
    // Leer la lista de números
    Para i <- 0 Hasta N-1 Hacer
        Escribir "Ingrese el número ", i+1, ":"
        Leer lista[i]
    FinPara
	
    
    Para i <- 0 Hasta N-1 Hacer
        frecuencias[i] <- 0
    FinPara
	
    
    Para i <- 0 Hasta N-1 Hacer
        Para j <- 0 Hasta N-1 Hacer
            Si lista[i] = lista[j] Entonces
                frecuencias[i] <- frecuencias[i] + 1
            FinSi
        FinPara
    FinPara
	
    
    maxFrecuencia <- 0
    moda <- lista[0]
    Para i <- 0 Hasta N-1 Hacer
        Si frecuencias[i] > maxFrecuencia Entonces
            maxFrecuencia <- frecuencias[i]
            moda <- lista[i]
        FinSi
    FinPara
	
    Escribir "La moda es: ", moda
FinProceso
