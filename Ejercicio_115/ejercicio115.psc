Algoritmo CajeroAutomatico
    Definir saldo_disponible, cantidad_retirar Como Real
	
    Escribir "Ingrese su saldo disponible:"
    Leer saldo_disponible
	
    Escribir "Ingrese la cantidad que desea retirar:"
    Leer cantidad_retirar
	
    Si cantidad_retirar <= saldo_disponible Entonces
        saldo_disponible <- saldo_disponible - cantidad_retirar
        Escribir "Retiro exitoso. Su saldo actual es:", saldo_disponible
    Sino
        Escribir "Saldo insuficiente. Operación no realizada."
    FinSi
FinAlgoritmo
