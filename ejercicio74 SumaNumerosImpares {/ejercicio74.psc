Algoritmo SumaNumerosImpares
    Definir suma, numero, contador Como Entero
    suma <- 0
    contador <- 1
	
    Mientras contador <= 10 Hacer
        Escribir "Introduce un n�mero: "
        Leer numero
		
        Si numero % 2 <> 0 Entonces
            suma <- suma + numero
        Fin Si
		
        contador <- contador + 1
    Fin Mientras
	
    Escribir "La suma de los n�meros impares es: ", suma
FinAlgoritmo
