Algoritmo SumarDigitosParesImpares
    Definir n, i, numero, sumaPares, sumaImpares Como Entero
    sumaPares <- 0
    sumaImpares <- 0
	
    Escribir "Ingrese la cantidad de números:"
    Leer n
	
    Para i <- 1 Hasta n Hacer
        Escribir "Ingrese el número ", i, ":"
        Leer numero
		
        sumaDigitos <- 0
        temp <- numero  // Guardamos el número original
		
        Mientras temp > 0 Hacer
            digito <- temp mod 10
            sumaDigitos <- sumaDigitos + digito
            temp <- trunc(temp / 10)
        FinMientras
		
        Si numero mod 2 = 0 Entonces
            sumaPares <- sumaPares + sumaDigitos
        Sino
            sumaImpares <- sumaImpares + sumaDigitos
        FinSi
    FinPara
	
    Escribir "Suma de los dígitos de los números pares: ", sumaPares
    Escribir "Suma de los dígitos de los números impares: ", sumaImpares
FinAlgoritmo
