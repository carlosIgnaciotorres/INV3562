Proceso DigitosParesEImpares
    Definir N, digito, pares, impares Como Entero
    Escribir "Ingrese un número:"
    Leer N
    pares <- 0
    impares <- 0
	
    Mientras N > 0 Hacer
        digito <- N MOD 10
        Si digito MOD 2 = 0 Entonces
            pares <- pares + 1
        Sino
            impares <- impares + 1
        FinSi
        N <- N / 10
    FinMientras
	
    Si pares = impares Entonces
        Escribir "El número tiene la misma cantidad de dígitos pares e impares."
    Sino
        Escribir "El número NO tiene la misma cantidad de dígitos pares e impares."
    FinSi
FinProceso
