monto_compra = float(input("Ingrese el monto de la compra: "))
tipo_cliente = input("Ingrese el tipo de cliente (Regular, Preferencial, Premium): ")

if tipo_cliente == "Regular":
    porcentaje_descuento = 5
elif tipo_cliente == "Preferencial":
    porcentaje_descuento = 10
elif tipo_cliente == "Premium":
    porcentaje_descuento = 20
else:
    porcentaje_descuento = 0

monto_descuento = monto_compra * (porcentaje_descuento / 100)
monto_total = monto_compra - monto_descuento

print("El monto del descuento es:", monto_descuento)
print("El monto total a pagar es:", monto_total)
