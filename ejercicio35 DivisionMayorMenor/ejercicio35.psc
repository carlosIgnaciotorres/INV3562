Proceso DivisionDelMayorEntreElMenor
    Definir Numero1, Numero2, Resultado Como Real
	
    Escribir "Ingrese el primer n�mero: "
    Leer Numero1
    Escribir "Ingrese el segundo n�mero: "
    Leer Numero2
	
    Si Numero1 > Numero2 Entonces
        Resultado = Numero1 / Numero2
    Sino
        Resultado = Numero2 / Numero1
    FinSi
	
    Escribir "El resultado de la divisi�n del n�mero mayor entre el n�mero menor es: ", Resultado
FinProceso
