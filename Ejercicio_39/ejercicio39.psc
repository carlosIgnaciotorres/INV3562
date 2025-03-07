Proceso ExtraerDiaNacimiento
    Definir FechaNacimiento Como Cadena
    Definir Dia Como Cadena
	
    Escribir "Ingrese su fecha de nacimiento (DD/MM/AAAA): "
    Leer FechaNacimiento
	
    Dia = Subcadena(FechaNacimiento, 1, 2)
	
    Escribir "El número del día de su nacimiento es: ", Dia
FinProceso
