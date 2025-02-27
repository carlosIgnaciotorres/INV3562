Algoritmo DecimalABinario
    Definir numero_decimal, cociente, residuo Como Entero
    Definir binario Como Cadena
    
    binario <- ""
    Escribir "Introduce un número decimal: "
    Leer numero_decimal
	
    cociente <- numero_decimal
	
    Mientras cociente > 0 Hacer
        residuo <- cociente % 2
        binario <- A_Cadena(residuo) + binario
        cociente <- cociente / 2
    Fin Mientras
	
    Escribir "El número binario es: ", binario
FinAlgoritmo
