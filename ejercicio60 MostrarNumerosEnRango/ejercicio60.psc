Algoritmo MostrarNumerosEnRango
    Definir numero1, numero2, contador Como Entero
	
    Escribir "Ingresa el primer n�mero (numero1): "
    Leer numero1
    Escribir "Ingresa el segundo n�mero (numero2): "
    Leer numero2
	
    Si numero1 > numero2 Entonces
        Escribir "Error: el primer n�mero debe ser menor o igual al segundo."
    Sino
        contador <- numero1
        Mientras contador <= numero2 Hacer
            Escribir contador
            contador <- contador + 1
        FinMientras
    FinSi
FinAlgoritmo
