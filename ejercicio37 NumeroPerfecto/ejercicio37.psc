Proceso VerificarNumeroPerfecto
    Definir Numero, SumaDivisores, Divisor Como Entero
	
    Escribir "Ingrese un n�mero: "
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
        Escribir "El n�mero es perfecto"
    Sino
        Escribir "El n�mero no es perfecto"
    FinSi
FinProceso