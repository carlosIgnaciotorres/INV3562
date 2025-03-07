saldo_disponible = float(input("Ingrese su saldo disponible: "))
cantidad_retirar = float(input("Ingrese la cantidad que desea retirar: "))

if cantidad_retirar <= saldo_disponible:
    saldo_disponible -= cantidad_retirar
    print("Retiro exitoso. Su saldo actual es:", saldo_disponible)
else:
    print("Saldo insuficiente. Operación no realizada.")
