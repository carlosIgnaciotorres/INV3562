Proceso SumaNumeros
    Definir N, suma Como Entero
    
    Escribir "Ingrese un número entero positivo:"
    Leer N
    
    Si N < 1 Entonces
        Escribir "El número debe ser mayor o igual a 1."
    Sino
        suma <- (N * (N + 1)) / 2
        Escribir "La suma de los números enteros de 1 hasta ", N, " es: ", suma
    FinSi
FinProceso
