Algoritmo SumarDiasAFecha
    Definir dia, mes, anio, numero_dias, dias_mes Como Entero
    Definir es_bisiesto Como Logico
	
    Escribir "Ingrese el día de la fecha inicial:"
    Leer dia
    Escribir "Ingrese el mes de la fecha inicial:"
    Leer mes
    Escribir "Ingrese el año de la fecha inicial:"
    Leer anio
    Escribir "Ingrese el número de días a sumar:"
    Leer numero_dias
	
    dia <- dia + numero_dias
	
    Mientras Verdadero Hacer
        Si mes = 2 Entonces
            Si (anio MOD 4 = 0 Y anio MOD 100 <> 0) O (anio MOD 400 = 0) Entonces
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
		
        Si dia <= dias_mes Entonces
            
        FinSi
		
        dia <- dia - dias_mes
        mes <- mes + 1
		
        Si mes > 12 Entonces
            mes <- 1
            anio <- anio + 1
        FinSi
    FinMientras
	
    Escribir "La nueva fecha es: ", dia, "/", mes, "/", anio
FinAlgoritmo
