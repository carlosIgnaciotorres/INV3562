N = int(input("Ingrese un número: "))

contador_pares = 0
contador_impares = 0

while N > 0:
    digito = N % 10
    if digito % 2 == 0:
        contador_pares += 1
    else:
        contador_impares += 1
    N //= 10

if contador_pares > contador_impares:
    print("El número tiene más dígitos pares.")
elif contador_impares > contador_pares:
    print("El número tiene más dígitos impares.")
else:
    print("El número tiene igual cantidad de dígitos pares e impares.")
