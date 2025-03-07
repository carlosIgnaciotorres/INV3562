Algoritmo SistemaDeTurnos
    Definir turno Como Entero
    turno <- 0
    Definir continuar Como Caracter
    continuar <- "s"
	
    Mientras continuar == "s" Hacer
        turno <- turno + 1
        Escribir "Tu número de turno es: ", turno
        Escribir "¿Deseas continuar asignando turnos? (s/n): "
        Leer continuar
    Fin Mientras
FinAlgoritmo
