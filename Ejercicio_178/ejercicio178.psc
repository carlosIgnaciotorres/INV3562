Proceso RaizCubica
    Definir N, X, X_nuevo, tolerancia Como Real
    Escribir "Ingrese un número:"
    Leer N
    X <- N / 3
    tolerancia <- 0.0001
	
    Repetir
        X_nuevo <- (2 * X + N / (X * X)) / 3
    Hasta Que Abs(X_nuevo - X) < tolerancia
	
    Escribir "La raíz cúbica aproximada es: ", X_nuevo
FinProceso
