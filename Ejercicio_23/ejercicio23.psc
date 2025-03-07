Proceso CompararIniciales
    Definir Nombre1, Nombre2 Como Cadena
    Definir Inicial1, Inicial2 Como Caracter
	
    Escribir "Ingrese el primer nombre: "
    Leer Nombre1
    Escribir "Ingrese el segundo nombre: "
    Leer Nombre2
	
    Si Longitud(Nombre1) > 0 Y Longitud(Nombre2) > 0 Entonces
        Inicial1 = Subcadena(Nombre1, 1, 1)
        Inicial2 = Subcadena(Nombre2, 1, 1)
		
        Si Inicial1 = Inicial2 Entonces
            Escribir "Los nombres tienen la misma inicial"
        Sino
            Escribir "Los nombres no tienen la misma inicial"
        FinSi
    Sino
        Escribir "Error: Uno o ambos nombres están vacíos"
    FinSi
FinProceso

