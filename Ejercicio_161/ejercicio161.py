numero = int(input("Ingrese un número: "))
suma = 0

for i in range(1, numero // 2 + 1):
    if numero % i == 0:
        suma += i

if suma == numero:
    print(f"El número {numero} es perfecto.")
else:
    print(f"El número {numero} no es perfecto.")