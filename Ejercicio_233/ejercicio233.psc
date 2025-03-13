Proceso TrianguloDePascal
    Definir N, i, j Como Entero
    Definir pascal Como Entero
	
    Escribir "Ingrese la altura del triángulo de Pascal (N):"
    Leer N
    Dimension pascal[N, N]
	
    Para i <- 0 Hasta N - 1 Hacer
        pascal[i, 0] <- 1
        pascal[i, i] <- 1
        Para j <- 1 Hasta i - 1 Hacer
            pascal[i, j] <- pascal[i - 1, j - 1] + pascal[i - 1, j]
        FinPara
    FinPara
	
    Escribir "Triángulo de Pascal:"
    Para i <- 0 Hasta N - 1 Hacer
        Para j <- 0 Hasta i Hacer
            Escribir Sin Saltar pascal[i, j], " "
        FinPara
        Escribir ""
    FinPara
FinProceso
