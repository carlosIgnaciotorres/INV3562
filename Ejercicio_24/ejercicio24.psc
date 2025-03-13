Proceso CompararLongitudNombres
    Definir Nombre1, Nombre2 Como Cadena
    Definir Longitud1, Longitud2 Como Entero
	
    Escribir "Ingrese el primer nombre: "
    Leer Nombre1
    Escribir "Ingrese el segundo nombre: "
    Leer Nombre2
	
    Longitud1 = Longitud(Nombre1)
    Longitud2 = Longitud(Nombre2)
	
    Si Longitud1 > Longitud2 Entonces
        Escribir "El primer nombre tiene más caracteres"
    Sino
        Si Longitud1 = Longitud2 Entonces
            Escribir "Ambos nombres tienen la misma cantidad de caracteres"
        Sino
            Escribir "El segundo nombre tiene más caracteres"
        FinSi
    FinSi
FinProceso
