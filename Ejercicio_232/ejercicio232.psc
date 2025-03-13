Proceso SumatoriaInversosPrimos
    Definir N, i, j Como Entero
    Definir suma Como Real
    Escribir "Ingrese el límite N:"
    Leer N
    suma <- 0
	
    Para i <- 2 Hasta N Hacer
        Definir esPrimo Como Logico
        esPrimo <- Verdadero
        Para j <- 2 Hasta i - 1 Hacer
            Si i MOD j = 0 Entonces
                esPrimo <- Falso
            FinSi
        FinPara
        Si esPrimo Entonces
            suma <- suma + (1 / i)
        FinSi
    FinPara
	
    Escribir "La sumatoria de los inversos de los primos hasta N es:", suma
FinProceso
