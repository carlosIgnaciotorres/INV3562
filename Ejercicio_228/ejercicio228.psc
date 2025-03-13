Proceso SumaSerieGeometrica
    Definir a, r, n, i Como Real
    Definir suma Como Real
    Escribir "Ingrese el primer término (a):"
    Leer a
    Escribir "Ingrese la razón (r):"
    Leer r
    Escribir "Ingrese el número de términos (n):"
    Leer n
	
    suma <- 0
    Para i <- 0 Hasta n - 1 Hacer
        suma <- suma + (a * r^i)
    FinPara
	
    Escribir "La suma de la serie geométrica es:", suma
FinProceso
