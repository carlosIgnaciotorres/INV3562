Algoritmo DeterminarBisiesto
    Definir a�o Como Entero
    Escribir "Ingrese un a�o: "
    Leer a�o
    Si (a�o mod 400 = 0) o ((a�o mod 4 = 0) y (a�o mod 100 <> 0)) Entonces
        Escribir "El a�o es bisiesto"
    Sino
        Escribir "El a�o NO es bisiesto"
    FinSi
FinAlgoritmo
