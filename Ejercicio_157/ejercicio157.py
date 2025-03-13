cantidad_productos = int(input("Ingresa la cantidad de productos: "))
total = 0

for i in range(cantidad_productos):
    producto = input(f"Ingresa el nombre del producto {i + 1}: ")
    precio = float(input(f"Ingresa el precio de {producto}: "))
    total += precio

print("El total de la compra es:", total)