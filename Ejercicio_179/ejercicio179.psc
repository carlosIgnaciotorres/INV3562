Proceso ContarDigitosParesImpares
    Definir N, digito, contador_pares, contador_impares Como Entero
    Escribir "Ingrese un número:"
    Leer N
    
    contador_pares <- 0
    contador_impares <- 0
    
    Mientras N > 0 Hacer
        digito <- N MOD 10
        Si digito MOD 2 = 0 Entonces
            contador_pares <- contador_pares + 1
        Sino
            contador_impares <- contador_impares + 1
        FinSi
        N <- N / 10
    FinMientras
    
    Si contador_pares > contador_impares Entonces
        Escribir "El número tiene más dígitos pares."
    Sino Si contador_impares > contador_pares Entonces
			Escribir "El número tiene más dígitos impares."
		Sino
			Escribir "El número tiene igual cantidad de dígitos pares e impares."
		FinSi
FinProceso
