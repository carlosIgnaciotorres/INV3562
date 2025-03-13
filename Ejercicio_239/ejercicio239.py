def suma_digitos(numero):
    suma = 0
    while numero > 0:
        suma += numero % 10
        numero //= 10
    return suma

n = int(input("Ingrese la cantidad de números: "))
suma_pares = 0
suma_impares = 0

for _ in range(n):
    num = int(input("Ingrese un número: "))
    if num % 2 == 0:
        suma_pares += suma_digitos(num)
    else:
        suma_impares += suma_digitos(num)

print("Suma de los dígitos de los números pares:", suma_pares)
print("Suma de los dígitos de los números impares:", suma_impares)
