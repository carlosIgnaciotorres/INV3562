Proceso ContarDigitosParesImpares
    Definir N, digito, contador_pares, contador_impares Como Entero
    Escribir "Ingrese un n�mero:"
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
        Escribir "El n�mero tiene m�s d�gitos pares."
    Sino Si contador_impares > contador_pares Entonces
			Escribir "El n�mero tiene m�s d�gitos impares."
		Sino
			Escribir "El n�mero tiene igual cantidad de d�gitos pares e impares."
		FinSi
FinProceso
