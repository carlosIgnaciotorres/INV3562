Algoritmo SumaNumerosImpares
    Definir suma, numero, contador Como Entero
    suma <- 0
    contador <- 1
	
    Mientras contador <= 10 Hacer
        Escribir "Introduce un número: "
        Leer numero
		
        Si numero % 2 <> 0 Entonces
            suma <- suma + numero
        Fin Si
		
        contador <- contador + 1
    Fin Mientras
	
    Escribir "La suma de los números impares es: ", suma
FinAlgoritmo
