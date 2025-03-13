Proceso EsPermutacion
    Definir num1, num2 Como Cadena
    Definir ordenado1, ordenado2 Como Cadena
    Escribir "Ingrese el primer número:"
    Leer num1
    Escribir "Ingrese el segundo número:"
    Leer num2
	
    Si Longitud(num1) <> Longitud(num2) Entonces
        Escribir "No es una permutación."
    Sino
        ordenado1 <- Ordenar(num1)
        ordenado2 <- Ordenar(num2)
        Si ordenado1 = ordenado2 Entonces
            Escribir "Es una permutación."
        Sino
            Escribir "No es una permutación."
        FinSi
    FinSi
FinProceso
