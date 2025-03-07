num = int(input("Ingrese un número: "))

while num >= 10:
    suma = 0
    while num > 0:
        suma += num % 10
        num //= 10
    num = suma

print("El resultado final es:", num)
