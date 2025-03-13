Proceso LogaritmoBase2
    Definir N, log Como Entero
    Escribir "Ingrese un número: "
    Leer N
    log <- 0
    Mientras N > 1 Hacer
        N <- N / 2
        log <- log + 1
    FinMientras
    Escribir "El logaritmo en base 2 es: ", log
FinProceso
