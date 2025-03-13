Proceso InvertirNumero
    Definir N, invertido, digito Como Entero
    Escribir "Ingrese un número:"
    Leer N
    invertido <- 0
    Mientras N > 0 Hacer
        digito <- N MOD 10
        invertido <- invertido * 10 + digito
        N <- N / 10
    FinMientras
    Escribir "Número invertido:", invertido
FinProceso
