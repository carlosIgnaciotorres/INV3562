Proceso NumeroArmstrong
    Definir num, original, digito, suma, num_digitos Como Entero
    Escribir "Ingrese un número:"
    Leer num
    
    original <- num
    suma <- 0
    num_digitos <- 0
    aux <- num
	
    Mientras aux > 0 Hacer
        num_digitos <- num_digitos + 1
        aux <- aux / 10
    FinMientras
	
    Mientras num > 0 Hacer
        digito <- num MOD 10
        potencia <- 1
        Para i <- 1 Hasta num_digitos Hacer
            potencia <- potencia * digito
        FinPara
        suma <- suma + potencia
        num <- num / 10
    FinMientras
	
    Si suma = original Entonces
        Escribir original, " es un número de Armstrong."
    Sino
        Escribir original, " no es un número de Armstrong."
    FinSi
FinProceso
