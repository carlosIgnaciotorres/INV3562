numero_decimal = int(input("Introduce un número decimal: "))
binario = ""

while numero_decimal > 0:
    residuo = numero_decimal % 2
    binario = str(residuo) + binario
    numero_decimal = numero_decimal // 2

print("El número binario es:", binario)
