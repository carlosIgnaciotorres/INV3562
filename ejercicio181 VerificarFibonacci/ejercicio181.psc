Proceso VerificarFibonacci
    Definir num, a, b, c Como Entero
    Escribir "Ingrese un número:"
    Leer num
    
    a <- 0
    b <- 1
    
    Si num = 0 O num = 1 Entonces
        Escribir num, " pertenece a la secuencia de Fibonacci."
    Sino
        c <- a + b
        Mientras c < num Hacer
            a <- b
            b <- c
            c <- a + b
        FinMientras
        
        Si c = num Entonces
            Escribir num, " pertenece a la secuencia de Fibonacci."
        Sino
            Escribir num, " no pertenece a la secuencia de Fibonacci."
        FinSi
    FinSi
FinProceso
