Algoritmo SumarNumeros
    Definir num1, num2, resultado Como Entero
	
    Escribir "Introduce el primer número: "
    Leer num1
	
    Escribir "Introduce el segundo número: "
    Leer num2
	
    resultado <- Suma(num1, num2)
	
    Escribir "La suma es: ", resultado
FinAlgoritmo

Funcion Suma(a, b)
    Definir resultado Como Entero
    resultado <- a + b
    Retornar resultado
FinFuncion



