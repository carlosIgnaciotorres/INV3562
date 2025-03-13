Proceso PiramideNumeros
    Definir N, i, j Como Entero
    Escribir "Ingrese la altura de la pirámide: "
    Leer N
    Para i <- 1 Hasta N Hacer
        Para j <- 1 Hasta N - i Hacer
            Escribir '', Sin Saltar
        FinPara
        Para j <- 1 Hasta 2 * i - 1 Hacer
            Escribir j, " ", Sin Saltar
        FinPara
        Escribir ""
    FinPara
FinProceso
