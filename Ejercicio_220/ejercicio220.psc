Proceso Mayor_Divisor
    Definir N, i, mayor Como Entero
    Escribir "Ingrese un número:"
    Leer N
    mayor <- 1
	
    Para i <- 1 Hasta N / 2 Hacer
        Si N MOD i = 0 Entonces
            mayor <- i
        FinSi
    FinPara
	
    Escribir "El mayor divisor distinto de sí mismo es:", mayor
FinProceso
