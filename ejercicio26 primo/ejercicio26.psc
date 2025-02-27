Proceso VerificarNumeroPrimo
    Definir Numero, Divisor Como Entero
    Definir EsPrimo Como Logico
    Escribir "Ingrese un n�mero: "
    Leer Numero
	
    Si Numero <= 1 Entonces
        Escribir "El n�mero no es primo"
    Sino
        Divisor = 2
        EsPrimo = Verdadero
		
        Mientras Divisor <= Raiz(Numero) Y EsPrimo Hacer
            Si Numero MOD Divisor = 0 Entonces
                EsPrimo = Falso
            FinSi
            Divisor = Divisor + 1
        FinMientras
		
        Si EsPrimo Entonces
            Escribir "El n�mero es primo"
        Sino
            Escribir "El n�mero no es primo"
        FinSi
    FinSi
FinProceso
