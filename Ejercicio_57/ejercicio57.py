suma = 0
cantidad = 0

while True:
    numero = float(input("Ingresar número (0 para terminar): "))
    if numero == 0:
        break
    suma += numero
    cantidad += 1

if cantidad > 0:
    media = suma / cantidad
    print(media)
else:
    print("No se ingresaron números válidos.")
