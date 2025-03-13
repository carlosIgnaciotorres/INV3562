Proceso ProbabilidadCara
    Definir N, i, caras Como Entero
    Definir resultado Como Real
    Escribir "Ingrese la cantidad de lanzamientos:"
    Leer N
    caras <- 0
	
    Para i <- 1 Hasta N Hacer
        Si Aleatorio(0,1) = 1 Entonces
            caras <- caras + 1
        FinSi
    FinPara
	
    resultado <- caras / N
    Escribir "La probabilidad de obtener cara es:", resultado
FinProceso
