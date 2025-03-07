Algoritmo MultiplicarNumeros
    Definir N, numero, multiplicador, contador Como Entero
    Escribir "Ingrese la cantidad de números a multiplicar:"
    Leer N
	
    multiplicador <- 1
    contador <- 1
	
    Mientras contador <= N Hacer
        Escribir "Ingrese un número:"
        Leer numero
        multiplicador <- multiplicador * numero
        contador <- contador + 1
    FinMientras
	
    Escribir "El resultado de la multiplicación es:", multiplicador
FinAlgoritmo
