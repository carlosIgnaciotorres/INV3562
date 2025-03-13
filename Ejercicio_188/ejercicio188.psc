Proceso Suma_Digitos
    Definir num, suma, digito Como Entero
	
    Escribir "Ingrese un número: "
    Leer num
	
    Mientras num >= 10 Hacer
        suma <- 0
        Mientras num > 0 Hacer
            digito <- num MOD 10
            suma <- suma + digito
            num <- trunc(num / 10) // Corrección aquí: trunc() para división entera
        FinMientras
        num <- suma
    FinMientras
	
    Escribir "El resultado final es: ", num
FinProceso
