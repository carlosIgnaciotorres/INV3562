numero = int(input("Ingresa un número entero: "))
while numero > 0:
    digito = numero % 10
    print(digito)
    numero = numero // 10
