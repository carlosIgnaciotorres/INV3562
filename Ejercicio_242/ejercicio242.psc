Proceso Generar_Secuencia
    Definir X, N, contador, multiplo Como Entero
    
    Escribir "Ingrese el número base (X):"
    Leer X
    Escribir "Ingrese el límite máximo (N):"
    Leer N
    
    contador <- 1
    
    Mientras (X * contador) <= N Hacer
        multiplo <- X * contador
        Escribir multiplo
        contador <- contador + 1
    FinMientras
    
    Escribir "Secuencia generada correctamente."
FinProceso
