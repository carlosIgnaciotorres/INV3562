Algoritmo BuscarValorEnLista
    Definir lista[10], valor_buscar, contador Como Entero
    contador <- 0
    lista <- [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  
	
    Escribir "Introduce el valor a buscar: "
    Leer valor_buscar
	
    Para i <- 1 Hasta 10 Con Paso 1 Hacer
        Si lista[i] = valor_buscar Entonces
            contador <- contador + 1
        Fin Si
    Fin Para
	
    Si contador > 0 Entonces
        Escribir "El valor se encontró ", contador, " veces."
    Sino
        Escribir "El valor no se encontró en la lista."
    Fin Si
FinAlgoritmo
