Algoritmo MostrarMesEnLetras
    Definir dia, mes, anio Como Entero
    Definir mes_letras Como Cadena
	
    Escribir "Ingrese el día:"
    Leer dia
    Escribir "Ingrese el mes (número del 1 al 12):"
    Leer mes
    Escribir "Ingrese el año:"
    Leer anio
	
    Segun mes Hacer
        1:  mes_letras <- "Enero"
        2:  mes_letras <- "Febrero"
        3:  mes_letras <- "Marzo"
        4:  mes_letras <- "Abril"
        5:  mes_letras <- "Mayo"
        6:  mes_letras <- "Junio"
        7:  mes_letras <- "Julio"
        8:  mes_letras <- "Agosto"
        9:  mes_letras <- "Septiembre"
        10: mes_letras <- "Octubre"
        11: mes_letras <- "Noviembre"
        12: mes_letras <- "Diciembre"
        De Otro Modo:
            mes_letras <- "Mes inválido"
    FinSegun
	
    Escribir "La fecha ingresada es:", dia, " de ", mes_letras, " de ", anio
FinAlgoritmo
