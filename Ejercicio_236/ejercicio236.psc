Proceso ContarPrimosGemelos
    Definir N, i, contador Como Entero
    Escribir "Ingrese el valor de N:"
    Leer N
    contador <- 0
	
    Funcion EsPrimo(num) Como Logico
        Definir j Como Entero
        Definir esPrimo Como Logico
        esPrimo <- Verdadero
        Si num < 2 Entonces
            esPrimo <- Falso
        Sino
            Para j <- 2 Hasta num / 2 Hacer
                Si num MOD j = 0 Entonces
                    esPrimo <- Falso
                FinSi
            FinPara
        FinSi
        Retornar esPrimo
FinFuncion

Para i <- 2 Hasta N - 2 Hacer
	Si EsPrimo(i) Y EsPrimo(i + 2) Entonces
		contador <- contador + 1
	FinSi
FinPara

Escribir "Cantidad de números primos gemelos en el rango:", contador
FinProceso
