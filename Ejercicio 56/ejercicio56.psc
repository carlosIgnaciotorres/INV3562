Algoritmo suma_multiplos_3
	Definir suma Como Entero
	Definir numero Como Entero
	Definir i Como Entero
	suma <- 0
	Para i <- 1 Hasta 15 Con Paso 1 Hacer
		Escribir "Ingresar número:"
		Leer numero
		Si numero % 3 = 0 Entonces
			suma <- suma + numero
		FinSi
	FinPara
	Escribir "La suma de los múltiplos de 3 es: ", suma
FinAlgoritmo
