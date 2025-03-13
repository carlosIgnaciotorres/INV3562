Algoritmo ContarDigitosYSumar
    Definir numero, digito, suma, cantidad_digitos Como Entero
    
    Escribir "Ingrese un número:"
    Leer numero
    
    suma <- 0
    cantidad_digitos <- 0
    
    Mientras numero > 0 Hacer
        digito <- numero MOD 10
        suma <- suma + digito
        cantidad_digitos <- cantidad_digitos + 1
        numero <- trunc(numero / 10)
    FinMientras
    
    Escribir "Cantidad de dígitos:", cantidad_digitos
    Escribir "Suma de los dígitos:", suma
FinAlgoritmo
