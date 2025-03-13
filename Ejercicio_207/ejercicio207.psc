Proceso SerieTribonacci
    Definir N, a, b, c, trib Como Entero
    Escribir "Ingrese la cantidad de números de la sucesión de Tribonacci a generar: "
    Leer N
    a <- 0
    b <- 1
    c <- 1
    Si N >= 1 Entonces Escribir a, " "
	FinSi

Si N >= 2 Entonces Escribir b, " " 
FinSi
Si N >= 3 Entonces Escribir c, " " 
FinSi
    Para i <- 4 Hasta N Hacer
        trib <- a + b + c
        Escribir trib, " "
        a <- b
        b <- c
        c <- trib
    FinPara
FinProceso
