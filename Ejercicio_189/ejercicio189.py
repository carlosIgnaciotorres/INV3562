suma = 0
contador = 0

num = float(input("Ingrese un número positivo (negativo para terminar): "))

while num >= 0:
    suma += num
    contador += 1
    num = float(input("Ingrese otro número positivo (negativo para terminar): "))

if contador > 0:
    print(f"La media de los números ingresados es: {suma / contador}")
else:
    print("No se ingresaron números positivos.")
