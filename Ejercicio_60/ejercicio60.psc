Algoritmo MostrarNumerosEnRango
    Definir numero1, numero2, contador Como Entero
	
    Escribir "Ingresa el primer número (numero1): "
    Leer numero1
    Escribir "Ingresa el segundo número (numero2): "
    Leer numero2
	
    Si numero1 > numero2 Entonces
        Escribir "Error: el primer número debe ser menor o igual al segundo."
    Sino
        contador <- numero1
        Mientras contador <= numero2 Hacer
            Escribir contador
            contador <- contador + 1
        FinMientras
    FinSi
FinAlgoritmo
