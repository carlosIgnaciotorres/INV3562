
numero = int(input("Ingrese un número: "))


suma_divisores = 0


for divisor in range(1, numero):
    if numero % divisor == 0:
        suma_divisores += divisor


if suma_divisores == numero:
    print(f"El número {numero} es perfecto")
else:
    print(f"El número {numero} no es perfecto")
