Algoritmo MultiplicarNumeros
    Definir N, numero, multiplicador, contador Como Entero
    Escribir "Ingrese la cantidad de n�meros a multiplicar:"
    Leer N
	
    multiplicador <- 1
    contador <- 1
	
    Mientras contador <= N Hacer
        Escribir "Ingrese un n�mero:"
        Leer numero
        multiplicador <- multiplicador * numero
        contador <- contador + 1
    FinMientras
	
    Escribir "El resultado de la multiplicaci�n es:", multiplicador
FinAlgoritmo
