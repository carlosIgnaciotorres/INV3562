Proceso DecimalAHexadecimal
    Definir N, residuo Como Entero
    Definir hexadecimal Como Cadena
    Escribir "Ingrese un número decimal:"
    Leer N
    hexadecimal <- ""
	
    Mientras N > 0 Hacer
        residuo <- N MOD 16
        Si residuo < 10 Entonces
            hexadecimal <- ConvertirATexto(residuo) + hexadecimal
        Sino
            hexadecimal <- SubCadena("ABCDEF", residuo - 10 + 1, residuo - 10 + 1) + hexadecimal
        FinSi
        N <- N / 16
    FinMientras
	
    Escribir "El número en hexadecimal es:", hexadecimal
FinProceso
