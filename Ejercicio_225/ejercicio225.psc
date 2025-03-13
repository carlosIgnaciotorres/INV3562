Proceso SumarMatrices
    Definir N, M, i, j Como Entero
    Definir A, B, C Como Entero
	
    Escribir "Ingrese el número de filas (N):"
    Leer N
    Escribir "Ingrese el número de columnas (M):"
    Leer M
	
    Dimension A[N, M], B[N, M], C[N, M]
	
    Escribir "Ingrese los elementos de la primera matriz:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta M - 1 Hacer
            Leer A[i, j]
        FinPara
    FinPara
	
    Escribir "Ingrese los elementos de la segunda matriz:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta M - 1 Hacer
            Leer B[i, j]
        FinPara
    FinPara
	
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta M - 1 Hacer
            C[i, j] <- A[i, j] + B[i, j]
        FinPara
    FinPara
	
    Escribir "La matriz resultante es:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta M - 1 Hacer
            Escribir Sin Saltar C[i, j], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
