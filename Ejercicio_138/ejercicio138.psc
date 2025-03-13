Algoritmo MayorMenor
    Definir N, numero, mayor, menor, i Como Entero
    Escribir "Ingrese la cantidad de números: "
    Leer N
    Escribir "Ingrese un número: "
    Leer numero
    mayor <- numero
    menor <- numero
    Para i <- 2 Hasta N Hacer
        Escribir "Ingrese un número: "
        Leer numero
        Si numero > mayor Entonces
            mayor <- numero
        FinSi
        Si numero < menor Entonces
            menor <- numero
        FinSi
    FinPara
    Escribir "Número mayor: ", mayor
    Escribir "Número menor: ", menor
FinAlgoritmo
