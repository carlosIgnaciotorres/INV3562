numero = int(input("Ingrese un número: "))

suma = 0
cantidad_digitos = 0

while numero > 0:
    digito = numero % 10
    suma += digito
    cantidad_digitos += 1
    numero //= 10

print("Cantidad de dígitos:", cantidad_digitos)
print("Suma de los dígitos:", suma)
