Algoritmo MayorMenor
    Definir N, numero, mayor, menor, i Como Entero
    Escribir "Ingrese la cantidad de n�meros: "
    Leer N
    Escribir "Ingrese un n�mero: "
    Leer numero
    mayor <- numero
    menor <- numero
    Para i <- 2 Hasta N Hacer
        Escribir "Ingrese un n�mero: "
        Leer numero
        Si numero > mayor Entonces
            mayor <- numero
        FinSi
        Si numero < menor Entonces
            menor <- numero
        FinSi
    FinPara
    Escribir "N�mero mayor: ", mayor
    Escribir "N�mero menor: ", menor
FinAlgoritmo
