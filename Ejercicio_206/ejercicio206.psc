Proceso FibonacciCercano
    Definir N, a, b, fib1, fib2 Como Entero
    Escribir "Ingrese un número: "
    Leer N
    a <- 0
    b <- 1
    Mientras b <= N Hacer
        fib1 <- a
        fib2 <- b
        a <- b
        b <- a + fib1
    FinMientras
    Si (N - fib1) <= (fib2 - N) Entonces
        Escribir "El número de Fibonacci más cercano es: ", fib1
    Sino
        Escribir "El número de Fibonacci más cercano es: ", fib2
    FinSi
FinProceso
