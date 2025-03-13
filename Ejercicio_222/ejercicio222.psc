Proceso NumeroPalindromicoMasCercano
    Definir N, menor, mayor, original, reverso, digito Como Entero
    Escribir "Ingrese un número:"
    Leer N
	
    menor <- N - 1
    mayor <- N + 1
	
    Mientras Verdadero Hacer
        original <- menor
        reverso <- 0
        Mientras original > 0 Hacer
            digito <- original MOD 10
            reverso <- reverso * 10 + digito
            original <- original / 10
        FinMientras
        Si reverso = menor Entonces
            Escribir "El número palindrómico más cercano es:", menor
            
        FinSi
		
        original <- mayor
        reverso <- 0
        Mientras original > 0 Hacer
            digito <- original MOD 10
            reverso <- reverso * 10 + digito
            original <- original / 10
        FinMientras
        Si reverso = mayor Entonces
            Escribir "El número palindrómico más cercano es:", mayor
            
        FinSi
		
        menor <- menor - 1
        mayor <- mayor + 1
    FinMientras
FinProceso
