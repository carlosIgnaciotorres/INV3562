Algoritmo DeterminarBisiesto
    Definir año Como Entero
    Escribir "Ingrese un año: "
    Leer año
    Si (año mod 400 = 0) o ((año mod 4 = 0) y (año mod 100 <> 0)) Entonces
        Escribir "El año es bisiesto"
    Sino
        Escribir "El año NO es bisiesto"
    FinSi
FinAlgoritmo
