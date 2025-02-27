Algoritmo SepararDigitos
    Definir Numero, Digito Como Enteros
    Escribir "Ingresa un número entero: "
    Leer Numero
    Mientras Numero > 0 Hacer
        Digito <- Numero % 10
        Escribir Digito
        Numero <- Numero // 10
    FinMientras
FinAlgoritmo
