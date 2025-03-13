Proceso Combinaciones
    Definir N, K, i Como Entero
    Definir num, den Como Real
    Escribir "Ingrese el número total de elementos (N): "
    Leer N
    Escribir "Ingrese el número de elementos a tomar (K): "
    Leer K
    num <- 1
    den <- 1
    Para i <- 0 Hasta K - 1 Hacer
        num <- num * (N - i)
        den <- den * (i + 1)
    FinPara
    Escribir "Las combinaciones posibles son: ", num / den
FinProceso
