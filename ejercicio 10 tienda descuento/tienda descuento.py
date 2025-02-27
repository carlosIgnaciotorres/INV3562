def calcular_total_con_descuento(total_compra, descuento):
    
    monto_descuento = total_compra * (descuento / 100)
    
    total_final = total_compra - monto_descuento
    return total_final


total_compra = float(input("Ingrese el total de la compra: "))


descuento = 15


total_final = calcular_total_con_descuento(total_compra, descuento)


print(f"El total a pagar después del descuento del {descuento}% es: {total_final:.2f}")
