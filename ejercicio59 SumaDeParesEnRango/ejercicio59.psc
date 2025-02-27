Algoritmo SumaDeParesEnRango
    Definir n, m, contador, suma Como Entero
	
    Escribir "Ingresa el valor de n: "
    Leer n
    Escribir "Ingresa el valor de m: "
    Leer m
	
    Si n > m Entonces
        Escribir "Error: n debe ser menor o igual a m"
    Sino
        suma <- 0
        contador <- n
		
        Mientras contador <= m Hacer
            Si contador % 2 = 0 Entonces
                suma <- suma + contador
            FinSi
            contador <- contador + 1
        FinMientras
		
        Escribir "La suma de los números pares en el rango es: ", suma
    FinSi
FinAlgoritmo
