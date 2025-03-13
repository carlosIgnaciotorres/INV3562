N = int(input("Ingrese un número: "))
pares, impares = 0, 0

while N > 0:
    digito = N % 10
    if digito % 2 == 0:
        pares += 1
    else:
        impares += 1
    N //= 10

if pares == impares:
    print("El número tiene la misma cantidad de dígitos pares e impares.")
else:
    print("El número NO tiene la misma cantidad de dígitos pares e impares.")
