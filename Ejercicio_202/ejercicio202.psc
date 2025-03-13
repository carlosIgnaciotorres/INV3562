Proceso NumerosPentagonales
    Definir N, i, pentagonal Como Entero
    Escribir "Ingrese la cantidad de números pentagonales a generar: "
    Leer N
    Para i <- 1 Hasta N Hacer
        pentagonal <- (i * (3 * i - 1)) / 2
        Escribir pentagonal, " "
    FinPara
FinProceso
