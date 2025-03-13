Proceso CuadradoPerfecto
    Definir N, suma, i Como Entero
    Escribir "Ingrese un número:"
    Leer N
    suma <- 0
    i <- 1
	
    Mientras suma < N Hacer
        suma <- suma + i
        i <- i + 2
    FinMientras
	
    Si suma = N Entonces
        Escribir "El número es un cuadrado perfecto."
    Sino
        Escribir "El número no es un cuadrado perfecto."
    FinSi
FinProceso
