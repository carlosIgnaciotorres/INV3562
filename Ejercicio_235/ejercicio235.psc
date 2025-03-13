Proceso ListasIguales
    Definir N, i, j Como Entero
    Definir lista1, lista2 Como Entero
    Definir iguales Como Logico
	
    Escribir "Ingrese la cantidad de elementos en las listas:"
    Leer N
    Dimension lista1[N], lista2[N]
	
    Escribir "Ingrese los elementos de la primera lista:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer lista1[i]
    FinPara
	
    Escribir "Ingrese los elementos de la segunda lista:"
    Para i <- 0 Hasta N - 1 Hacer
        Leer lista2[i]
    FinPara
	
    Para i <- 0 Hasta N - 1 Hacer
        Definir encontrado Como Logico
        encontrado <- Falso
        Para j <- 0 Hasta N - 1 Hacer
            Si lista1[i] = lista2[j] Entonces
                lista2[j] <- -99999
                encontrado <- Verdadero
			
			
            FinSi
	FinPara
        Si encontrado = Falso Entonces
            Escribir "Las listas no son iguales."
FinProceso

Escribir "Las listas son iguales sin importar el orden."
FinProceso
