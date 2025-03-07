Algoritmo NumeroCapicua
    Definir numero, numero_invertido, digito, temp Como Entero
    Escribir "Ingrese un número: "
    Leer numero
    temp <- numero
    numero_invertido <- 0
    Mientras temp > 0 Hacer
        digito <- temp mod 10
        numero_invertido <- numero_invertido * 10 + digito
        temp <- trunc(temp / 10)
    FinMientras
    Si numero = numero_invertido Entonces
        Escribir "El número es capicúa"
    Sino
        Escribir "El número NO es capicúa"
    FinSi
FinAlgoritmo