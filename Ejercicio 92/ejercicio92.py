nombre = input("Ingresa el nombre del cliente: ")
costo_sandalias = float(input("Ingresa el costo de las sandalias: "))
costo_tenis = float(input("Ingresa el costo de los tenis: "))
costo_mocasines = float(input("Ingresa el costo de los mocasines: "))
cantidad_sandalias = int(input("Ingresa la cantidad de sandalias: "))
cantidad_tenis = int(input("Ingresa la cantidad de tenis: "))
cantidad_mocasines = int(input("Ingresa la cantidad de mocasines: "))

precio_sandalias = costo_sandalias * 1.55
precio_tenis = costo_tenis * 1.55
precio_mocasines = costo_mocasines * 1.55

valor_sin_descuento = (cantidad_sandalias * precio_sandalias) + (cantidad_tenis * precio_tenis) + (cantidad_mocasines * precio_mocasines)
descuento = valor_sin_descuento * 0.08
valor_con_descuento = valor_sin_descuento - descuento
venta_neta_final = valor_con_descuento * 1.16

print(f"Nombre del cliente: {nombre}")
print(f"Valor sin descuento: {valor_sin_descuento:.2f}")
print(f"Descuento: {descuento:.2f}")
print(f"Valor con descuento: {valor_con_descuento:.2f}")
print(f"Venta neta final: {venta_neta_final:.2f}")
