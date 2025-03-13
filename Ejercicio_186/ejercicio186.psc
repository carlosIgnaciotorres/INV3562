Proceso Sucesion_Padovan
    Definir P Como Entero
    Dimension P[10]
    Definir i Como Entero
	
    P[0] <- 1
    P[1] <- 1
    P[2] <- 1
	
    Para i <- 3 Hasta 9 Hacer
        P[i] <- P[i-2] + P[i-3]
    FinPara
	
    Escribir "Los primeros 10 números de la sucesión de Padovan son: "
    Para i <- 0 Hasta 9 Hacer
        Escribir P[i], " "
    FinPara
FinProceso
