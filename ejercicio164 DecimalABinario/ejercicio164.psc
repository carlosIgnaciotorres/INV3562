Algoritmo DecimalABinario
    Definir decimal, residuo Como Entero
    Definir binario Como Cadena
    Escribir "Ingrese un n�mero decimal:"
    Leer decimal
    binario <- ""
	
    Mientras decimal > 0 Hacer
        residuo <- decimal % 2
        binario <- Concatenar( residuo, binario)
        decimal <- decimal // 2
    FinMientras
	
    Escribir "El n�mero binario es: ", binario
FinAlgoritmo