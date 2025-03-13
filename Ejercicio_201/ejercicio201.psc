Proceso PrimoMersenne
    Definir n, p, i Como Entero
    Definir esPrimo Como Logico
    Escribir "Ingrese un número primo p:"
    Leer p
    n <- 2^p - 1
    esPrimo <- Verdadero
    Para i <- 2 Hasta raiz(n) Hacer
        Si n Mod i = 0 Entonces
            esPrimo <- Falso
		
        FinSi
    FinPara
    Si esPrimo Entonces
        Escribir n, " es un primo de Mersenne."
    Sino
        Escribir n, " no es un primo de Mersenne."
    FinSi
FinProceso
