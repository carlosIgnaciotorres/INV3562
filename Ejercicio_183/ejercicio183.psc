Proceso Numeros_Primos
    Definir N, X, i, contador Como Entero
    Escribir "Ingrese un número N: "
    Leer N
    Escribir "Números primos entre 1 y ", N, ": "
    
    Para X <- 2 Hasta N Hacer
        contador <- 0
        Para i <- 1 Hasta X Hacer
            Si (X MOD i = 0) Entonces
                contador <- contador + 1
            FinSi
        FinPara
        Si contador = 2 Entonces
            Escribir X, " "
        FinSi
    FinPara
FinProceso
