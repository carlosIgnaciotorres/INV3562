Proceso ParImparOCero
    Definir numero Como Entero
	
    
    Escribir "Ingresa un n�mero entero: "
    Leer numero
	
    
    Si numero = 0 Entonces
        Escribir "El n�mero es cero."
    Sino
        Si numero % 2 = 0 Entonces
            Escribir "El n�mero ", numero, " es par."
        Sino
            Escribir "El n�mero ", numero, " es impar."
        FinSi
    FinSi
FinProceso
