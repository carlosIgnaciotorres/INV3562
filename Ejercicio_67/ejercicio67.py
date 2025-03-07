N = int(input("Ingrese un número: "))

suma_pares = 0
suma_impares = 0

while N > 0:
    digito = N % 10
    if digito % 2 == 0:
        suma_pares += digito
    else:
        suma_impares += digito
    N = N // 10

print("Suma de pares:", suma_pares)
print("Suma de impares:", suma_impares)
