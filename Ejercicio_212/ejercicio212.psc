Proceso LanzamientoDeDosDados
    Definir i, dado1, dado2, dobles Como Entero
    Escribir "Ingrese la cantidad de lanzamientos:"
    Leer N
    dobles <- 0
	
    Para i <- 1 Hasta N Hacer
        dado1 <- Aleatorio(1,6)
        dado2 <- Aleatorio(1,6)
        Si dado1 = dado2 Entonces
            dobles <- dobles + 1
        FinSi
    FinPara
	
    Escribir "Cantidad de dobles obtenidos:", dobles
FinProceso
