Algoritmo OperacionesAritmeticas
    Definir num1, num2, suma, resta, multiplicacion, division Como Real
    Escribir "Ingrese el primer número: "
    Leer num1
    Escribir "Ingrese el segundo número: "
    Leer num2
    suma <- num1 + num2
    resta <- num1 - num2
    multiplicacion <- num1 * num2
    Si num2 <> 0 Entonces
        division <- num1 / num2
        Escribir "División: ", division
    Sino
        Escribir "Error: No se puede dividir por cero"
    FinSi
    Escribir "Suma: ", suma
    Escribir "Resta: ", resta
    Escribir "Multiplicación: ", multiplicacion
FinAlgoritmo
