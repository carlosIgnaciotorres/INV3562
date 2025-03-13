total = 0

precio = float(input("Ingrese el precio del producto (0 para finalizar): "))

while precio != 0:
    total += precio
    precio = float(input("Ingrese el precio del producto (0 para finalizar): "))

print(f"El total a pagar es: {total}")
