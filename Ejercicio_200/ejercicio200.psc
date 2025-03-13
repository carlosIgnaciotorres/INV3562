Proceso SumarDigitosHastaUnaCifra
    Definir N, suma, digito Como Entero
    Escribir "Ingrese un número:"
    Leer N
	
    Mientras N >= 10 Hacer
        suma <- 0
        Mientras N > 0 Hacer
            digito <- N MOD 10
            suma <- suma + digito
            N <- N / 10
        FinMientras
        N <- suma
    FinMientras
	
    Escribir "Suma de los dígitos hasta una cifra:", N
FinProceso
