N = int(input("Ingrese la cantidad de números de la sucesión de Tribonacci a generar: "))

a, b, c = 0, 1, 1

if N >= 1:
    print(a, end=" ")
if N >= 2:
    print(b, end=" ")
if N >= 3:
    print(c, end=" ")

for _ in range(4, N + 1):
    trib = a + b + c
    print(trib, end=" ")
    a, b, c = b, c, trib
