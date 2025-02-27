Algoritmo ContarParesImparesCeros
    Definir pares, impares, ceros, contador, numero Como Entero
    pares <- 0
    impares <- 0
    ceros <- 0
    contador <- 1
	
    Mientras contador <= 10 Hacer
        Escribir "Introduce un número: "
        Leer numero
		
        Si numero = 0 Entonces
            ceros <- ceros + 1
        Sino
            Si numero % 2 = 0 Entonces
                pares <- pares + 1
            Sino
                impares <- impares + 1
            Fin Si
        Fin Si
		
        contador <- contador + 1
    Fin Mientras
	
    Escribir "Pares = ", pares
    Escribir "Impares = ", impares
    Escribir "Ceros = ", ceros
FinAlgoritmo

