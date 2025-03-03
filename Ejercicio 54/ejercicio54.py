cantidad = int(input("Ingrese la cantidad de camisas: "))
precio = float(input("Ingrese el precio por camisa: "))

if cantidad >= 3:
    total = (cantidad * precio) * 0.80
else:
    total = (cantidad * precio) * 0.90

print("El total a pagar es:", total)
