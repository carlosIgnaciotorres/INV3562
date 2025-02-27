Proceso VerificarNumeroPrimo
    Definir Numero, Divisor Como Entero
    Definir EsPrimo Como Logico
    Escribir "Ingrese un número: "
    Leer Numero
	
    Si Numero <= 1 Entonces
        Escribir "El número no es primo"
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
            Escribir "El número es primo"
        Sino
            Escribir "El número no es primo"
        FinSi
    FinSi
FinProceso
