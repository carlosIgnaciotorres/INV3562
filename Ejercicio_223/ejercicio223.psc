Proceso CuentaRegresiva
    Definir N Como Entero
    Escribir "Ingrese el tiempo en segundos:"
    Leer N
	
    Mientras N >= 0 Hacer
        Escribir "Tiempo restante: ", N, " segundos"
        Esperar 1 Segundos
        N <- N - 1
    FinMientras
	
    Escribir "¡Tiempo terminado!"
FinProceso
