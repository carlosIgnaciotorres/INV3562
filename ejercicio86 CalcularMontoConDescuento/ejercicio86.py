monto_compra = float(input("Ingresa el monto de la compra: "))
if monto_compra > 1000:
    descuento = monto_compra * 0.20
    monto_final = monto_compra - descuento
else:
    monto_final = monto_compra
print(f"El monto total a pagar es: {monto_final:.2f}")
