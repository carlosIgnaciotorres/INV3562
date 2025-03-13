def cuenta_bancaria():
    saldo = float(input("Ingrese el saldo inicial de la cuenta: "))
    
    while True:
        print("Seleccione una opción: 1) Depositar  2) Retirar  3) Salir")
        opcion = int(input())

        if opcion == 1:
            monto = float(input("Ingrese la cantidad a depositar: "))
            saldo += monto
            print(f"Nuevo saldo: {saldo}")
        
        elif opcion == 2:
            monto = float(input("Ingrese la cantidad a retirar: "))
            if monto <= saldo:
                saldo -= monto
                print(f"Nuevo saldo: {saldo}")
            else:
                print("Error: Fondos insuficientes.")
        
        elif opcion == 3:
            print(f"Operaciones finalizadas. Saldo final: {saldo}")
            break

cuenta_bancaria()
