Proceso ParImparOCero
    Definir numero Como Entero
	
    
    Escribir "Ingresa un número entero: "
    Leer numero
	
    
    Si numero = 0 Entonces
        Escribir "El número es cero."
    Sino
        Si numero % 2 = 0 Entonces
            Escribir "El número ", numero, " es par."
        Sino
            Escribir "El número ", numero, " es impar."
        FinSi
    FinSi
FinProceso
