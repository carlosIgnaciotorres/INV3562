Algoritmo DistribucionDeFrecuencias
    Definir n Como Entero
    Definir valor Como Real
    Dimension lista_valores[1000]
    Dimension rangos[6]
    Dimension frecuencias[5]
    Definir i, j Como Entero
	
    Escribir "Ingrese el número de valores:"
    Leer n
	
    Para i<-1 Hasta n Hacer
        Escribir "Ingrese valor ", i, ":"
        Leer valor
        lista_valores[i] <- valor
    Fin Para
	
    rangos[1] <- 0
    rangos[2] <- 10
    rangos[3] <- 20
    rangos[4] <- 30
    rangos[5] <- 40
    rangos[6] <- 50
	
    Para i<-1 Hasta 5 Hacer
        frecuencias[i] <- 0
    Fin Para
	
    Para i<-1 Hasta n Hacer
        Para j<-1 Hasta 5 Hacer
            Si lista_valores[i] >= rangos[j] Y lista_valores[i] < rangos[j+1] Entonces
                frecuencias[j] <- frecuencias[j] + 1
            FinSi
        Fin Para
    Fin Para
	
    Para i<-1 Hasta 5 Hacer
        Escribir "Rango ", rangos[i], " - ", rangos[i+1], ": ", frecuencias[i]
    Fin Para
FinAlgoritmo
