Proceso MatrizSimetrica
    Definir N, i, j Como Entero
    Definir simetrica Como Logico
    Definir A Como Entero
	
    Escribir "Ingrese el tamaño de la matriz cuadrada (N x N):"
    Leer N
    Dimension A[N, N]
    simetrica <- Verdadero
	
    Escribir "Ingrese los elementos de la matriz:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta N - 1 Hacer
            Leer A[i, j]
        FinPara
    FinPara
	
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- i + 1 Hasta N - 1 Hacer
            Si A[i, j] <> A[j, i] Entonces
                simetrica <- Falso
            FinSi
        FinPara
    FinPara
	
    Si simetrica Entonces
        Escribir "La matriz es simétrica."
    Sino
        Escribir "La matriz no es simétrica."
    FinSi
FinProceso
