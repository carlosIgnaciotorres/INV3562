N = int(input("Ingrese un número: "))
suma, i = 0, 1

while suma < N:
    suma += i
    i += 2

if suma == N:
    print("El número es un cuadrado perfecto.")
else:
    print("El número no es un cuadrado perfecto.")
