Proceso Calcular_Mediana
    Definir lista Como Entero
    Dimension lista[20]
    Definir i, j, temp Como Entero
    Definir mediana Como Real
	
    Para i <- 0 Hasta 19 Hacer
        lista[i] <- Aleatorio(1, 100)
    FinPara
	
    Para i <- 0 Hasta 18 Hacer
        Para j <- i+1 Hasta 19 Hacer
            Si lista[i] > lista[j] Entonces
                temp <- lista[i]
                lista[i] <- lista[j]
                lista[j] <- temp
            FinSi
        FinPara
    FinPara
	
    Si 20 MOD 2 = 0 Entonces
        mediana <- (lista[9] + lista[10]) / 2.0
    Sino
        mediana <- lista[10]
    FinSi
	
    Escribir "La mediana de los números generados es: ", mediana
FinProceso
