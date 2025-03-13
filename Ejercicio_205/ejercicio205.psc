Proceso SecuenciaCollatz
    Definir N Como Entero
    Escribir "Ingrese un número: "
    Leer N
    Mientras N <> 1 Hacer
        Escribir N, " "
        Si N Mod 2 = 0 Entonces
            N <- N / 2
        Sino
            N <- 3 * N + 1
        FinSi
    FinMientras
    Escribir N
FinProceso
