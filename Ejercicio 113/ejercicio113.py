valor_neto = float(input("Ingrese el valor neto del producto: "))
porcentaje_iva = float(input("Ingrese el porcentaje de IVA: "))

iva = valor_neto * (porcentaje_iva / 100)
costo_total = valor_neto + iva

print("El costo total del producto es:", costo_total)
