Algoritmo MediaMedianaModa
    Definir N, numero, i, suma, media, mediana Como Real
    Definir lista_numeros Como Coleccion de Enteros
    Dimension lista_numeros[1000]
	
    Escribir "Ingrese el número de elementos:"
    Leer N
	
    suma <- 0
    Para i<-1 Hasta N Hacer
        Escribir "Ingrese el número ", i, ":"
        Leer numero
        lista_numeros[i] <- numero
        suma <- suma + numero
    FinPara
	
    media <- suma / N
	
    Ordenar lista_numeros
	
    Si Mod(N, 2) = 0 Entonces
        mediana <- (lista_numeros[N/2] + lista_numeros[N/2 + 1]) / 2
    Sino
        mediana <- lista_numeros[N/2 + 1]
    FinSi
	
    Definir maxima_frec, frec_actual, moda Como Entero
    maxima_frec <- 0
    Para i<-1 Hasta N Hacer
        frec_actual <- Contar(lista_numeros, lista_numeros[i])
        Si frec_actual > maxima_frec Entonces
            maxima_frec <- frec_actual
            moda <- lista_numeros[i]
        FinSi
    FinPara
	
    Escribir "Media: ", media
    Escribir "Mediana: ", mediana
    Escribir "Moda: ", moda
FinAlgoritmo
