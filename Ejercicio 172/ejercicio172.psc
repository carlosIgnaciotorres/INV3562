Proceso SumaNumeros
    Definir N, suma Como Entero
    
    Escribir "Ingrese un n�mero entero positivo:"
    Leer N
    
    Si N < 1 Entonces
        Escribir "El n�mero debe ser mayor o igual a 1."
    Sino
        suma <- (N * (N + 1)) / 2
        Escribir "La suma de los n�meros enteros de 1 hasta ", N, " es: ", suma
    FinSi
FinProceso
