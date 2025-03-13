Proceso OrdenarBurbuja
    Definir N, i, j, temp Como Entero
    Definir lista Como Entero
	
    Escribir "Ingrese la cantidad de números:"
    Leer N
	
    Dimension lista[N]  
	
    Para i <- 0 Hasta N - 1 Hacer
        Escribir "Ingrese un número:"
        Leer lista[i]
    FinPara
	
    Para i <- 0 Hasta N - 2 Hacer
        Para j <- 0 Hasta N - i - 2 Hacer
            Si lista[j] > lista[j + 1] Entonces
                temp <- lista[j]
                lista[j] <- lista[j + 1]
                lista[j + 1] <- temp
            FinSi
        FinPara
    FinPara
	
    Escribir "Lista ordenada:"
    Para i <- 0 Hasta N - 1 Hacer
        Escribir lista[i]
    FinPara
FinProceso
