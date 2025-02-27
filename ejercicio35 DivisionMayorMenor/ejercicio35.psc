Proceso DivisionDelMayorEntreElMenor
    Definir Numero1, Numero2, Resultado Como Real
	
    Escribir "Ingrese el primer número: "
    Leer Numero1
    Escribir "Ingrese el segundo número: "
    Leer Numero2
	
    Si Numero1 > Numero2 Entonces
        Resultado = Numero1 / Numero2
    Sino
        Resultado = Numero2 / Numero1
    FinSi
	
    Escribir "El resultado de la división del número mayor entre el número menor es: ", Resultado
FinProceso
