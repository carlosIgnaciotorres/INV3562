Proceso VerificarNumeroPerfecto
    Definir Numero, SumaDivisores, Divisor Como Entero
	
    Escribir "Ingrese un número: "
    Leer Numero
	
    SumaDivisores = 0
    Divisor = 1
	
    Mientras Divisor < Numero Hacer
        Si Numero MOD Divisor = 0 Entonces
            SumaDivisores = SumaDivisores + Divisor
        FinSi
        Divisor = Divisor + 1
    FinMientras
	
    Si SumaDivisores = Numero Entonces
        Escribir "El número es perfecto"
    Sino
        Escribir "El número no es perfecto"
    FinSi
FinProceso