Proceso ContarMayoresQueMedia
    Definir N, i, suma, media, contador Como Real
    Definir lista Como Vector de Real
    Escribir "Ingrese la cantidad de números:"
    Leer N
    Dimension lista[N]
    suma <- 0
	
    Para i <- 0 Hasta N-1 Hacer
        Escribir "Ingrese un número:"
        Leer lista[i]
        suma <- suma + lista[i]
    FinPara
	
    media <- suma / N
    contador <- 0
	
    Para i <- 0 Hasta N-1 Hacer
        Si lista[i] > media Entonces
            contador <- contador + 1
        FinSi
    FinPara
	
    Escribir "Cantidad de números mayores que la media:", contador
FinProceso
