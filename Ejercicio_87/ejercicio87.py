cantidad_camisas = int(input("Ingresa la cantidad de camisas: "))
precio_unitario = float(input("Ingresa el precio unitario de cada camisa: "))
precio_total = cantidad_camisas * precio_unitario
if cantidad_camisas >= 3:
    descuento = precio_total * 0.20
else:
    descuento = precio_total * 0.10
total_a_pagar = precio_total - descuento
print(f"El total a pagar es: {total_a_pagar:.2f}")
