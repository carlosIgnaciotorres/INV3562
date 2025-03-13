Proceso Calcular_Media
    Definir num, suma, contador Como Real
    suma <- 0
    contador <- 0
	
    Escribir "Ingrese un número positivo (negativo para terminar): "
    Leer num
	
    Mientras num >= 0 Hacer
        suma <- suma + num
        contador <- contador + 1
        Escribir "Ingrese otro número positivo (negativo para terminar): "
        Leer num
    FinMientras
	
    Si contador > 0 Entonces
        Escribir "La media de los números ingresados es: ", suma / contador
    Sino
        Escribir "No se ingresaron números positivos."
    FinSi
FinProceso
