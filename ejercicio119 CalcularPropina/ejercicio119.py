monto_cuenta = float(input("Ingrese el monto de la cuenta: "))
porcentaje_propina = float(input("Ingrese el porcentaje de propina: "))

propina = monto_cuenta * (porcentaje_propina / 100)
total_cuenta = monto_cuenta + propina

print("El monto de la propina es:", propina)
print("El total a pagar es:", total_cuenta)
