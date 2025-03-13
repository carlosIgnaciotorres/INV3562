Proceso Cuenta_Bancaria
    Definir saldo, monto Como Real
    Definir opcion Como Entero
    
    Escribir "Ingrese el saldo inicial de la cuenta:"
    Leer saldo
    
    Repetir
        Escribir "Seleccione una opción: 1) Depositar  2) Retirar  3) Salir"
        Leer opcion
        
        Si opcion = 1 Entonces
            Escribir "Ingrese la cantidad a depositar:"
            Leer monto
            saldo <- saldo + monto
            Escribir "Nuevo saldo: ", saldo
        FinSi
        
        Si opcion = 2 Entonces
            Escribir "Ingrese la cantidad a retirar:"
            Leer monto
            Si monto <= saldo Entonces
                saldo <- saldo - monto
                Escribir "Nuevo saldo: ", saldo
            Sino
                Escribir "Error: Fondos insuficientes."
            FinSi
        FinSi
    Hasta Que opcion = 3
    
    Escribir "Operaciones finalizadas. Saldo final: ", saldo
FinProceso
