Algoritmo SumaDigitosParesImpares
    Definir N, digito, suma_pares, suma_impares Como Entero
	
    Escribir "Ingrese un número:"
    Leer N
	
    suma_pares <- 0
    suma_impares <- 0
	
    Mientras N > 0 Hacer
        digito <- N MOD 10
        Si digito MOD 2 = 0 Entonces
            suma_pares <- suma_pares + digito
        Sino
            suma_impares <- suma_impares + digito
        FinSi
        N <- trunc(N / 10)
    FinMientras
	
    Escribir "Suma de pares:", suma_pares
    Escribir "Suma de impares:", suma_impares
FinAlgoritmo
