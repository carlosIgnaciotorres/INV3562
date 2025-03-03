Algoritmo VerificarFechaValida
    Definir dia, mes, anio, dias_mes Como Entero
    Definir es_bisiesto Como Logico
	
    Escribir "Ingrese el día:"
    Leer dia
    Escribir "Ingrese el mes:"
    Leer mes
    Escribir "Ingrese el año:"
    Leer anio
	
    Si mes < 1 O mes > 12 Entonces
        Escribir "Fecha inválida: el mes debe estar entre 1 y 12."
    Sino
        Si (anio MOD 4 = 0 Y anio MOD 100 <> 0) O (anio MOD 400 = 0) Entonces
            es_bisiesto <- Verdadero
        Sino
            es_bisiesto <- Falso
        FinSi
		
        Si mes = 2 Entonces
            Si es_bisiesto Entonces
                dias_mes <- 29
            Sino
                dias_mes <- 28
            FinSi
        Sino
            Si mes = 4 O mes = 6 O mes = 9 O mes = 11 Entonces
                dias_mes <- 30
            Sino
                dias_mes <- 31
            FinSi
        FinSi
		
        Si dia < 1 O dia > dias_mes Entonces
            Escribir "Fecha inválida: el día no existe en este mes."
		FinSi

