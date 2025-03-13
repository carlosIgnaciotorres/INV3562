N = int(input("Ingrese un número: "))
mayor_divisor = 1

for i in range(1, N // 2 + 1):
    if N % i == 0:
        mayor_divisor = i

print("El mayor divisor distinto de sí mismo es:", mayor_divisor)
