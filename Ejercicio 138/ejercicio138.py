N = int(input("Ingrese la cantidad de números: "))
numero = int(input("Ingrese un número: "))
mayor = numero
menor = numero

for i in range(1, N):
    numero = int(input("Ingrese un número: "))
    if numero > mayor:
        mayor = numero
    if numero < menor:
        menor = numero

print("Número mayor:", mayor)
print("Número menor:", menor)

