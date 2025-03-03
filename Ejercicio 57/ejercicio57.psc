Algoritmo CalcularMedia
	Definir suma Como Real
	Definir cantidad Como Entero
	Definir numero Como Real
	Definir media Como Real
	
	suma <- 0
	cantidad <- 0
	
	Repetir
		Escribir "Ingresar número (0 para terminar):"
		Leer numero
		
		Si numero <> 0 Entonces
			suma <- suma + numero
			cantidad <- cantidad + 1
		FinSi
		
	Hasta Que numero = 0
	
	Si cantidad > 0 Entonces
		media <- suma / cantidad
		Escribir "La media de los números ingresados es: ", media
	SiNo
		Escribir "No se ingresaron números válidos."
	FinSi
FinAlgoritmo
