Proceso MultiplicarMatrices
    Definir N, M, P, i, j, k Como Entero
    Definir A, B, C Como Entero
	
    Escribir "Ingrese el número de filas de la primera matriz (N):"
    Leer N
    Escribir "Ingrese el número de columnas de la primera matriz / filas de la segunda matriz (M):"
    Leer M
    Escribir "Ingrese el número de columnas de la segunda matriz (P):"
    Leer P
	
    Dimension A[N, M], B[M, P], C[N, P]
	
    Escribir "Ingrese los elementos de la primera matriz:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta M - 1 Hacer
            Leer A[i, j]
        FinPara
    FinPara
	
    Escribir "Ingrese los elementos de la segunda matriz:"
    Para i <- 0 Hasta M - 1 Hacer
        Para j <- 0 Hasta P - 1 Hacer
            Leer B[i, j]
        FinPara
    FinPara
	
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta P - 1 Hacer
            C[i, j] <- 0
            Para k <- 0 Hasta M - 1 Hacer
                C[i, j] <- C[i, j] + A[i, k] * B[k, j]
            FinPara
        FinPara
    FinPara
	
    Escribir "La matriz resultante es:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta P - 1 Hacer
            Escribir Sin Saltar C[i, j], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
