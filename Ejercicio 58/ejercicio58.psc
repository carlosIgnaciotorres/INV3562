Algoritmo MultiplesDe3HastaN
    Definir n, contador Como Entero
    Escribir "Por favor, ingresa un n�mero entero positivo: "
    Leer n
    Si n <= 0 Entonces
        Escribir "Error: el n�mero debe ser positivo."
    Sino
        contador <- 1
        Escribir "M�ltiplos de 3 desde 1 hasta ", n, ":"
        Mientras contador <= n Hacer
            Si contador % 3 = 0 Entonces
                Escribir contador
            FinSi
            contador <- contador + 1
        FinMientras
    FinSi
FinAlgoritmo
