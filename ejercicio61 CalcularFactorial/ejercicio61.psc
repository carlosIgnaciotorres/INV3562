Algoritmo CalcularFactorial
    Definir n, contador, factorial Como Entero
	
    Escribir "Ingresa un n�mero entero positivo: "
    Leer n
	
    Si n < 0 Entonces
        Escribir "Error: El n�mero debe ser un entero positivo."
    Sino
        factorial <- 1
        contador <- 1
		
        Mientras contador <= n Hacer
            factorial <- factorial * contador
            contador <- contador + 1
        FinMientras
		
        Escribir "El factorial de ", n, " es: ", factorial
    FinSi
FinAlgoritmo
