def es_permutacion(num1, num2):
    return sorted(str(num1)) == sorted(str(num2))

num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))

if es_permutacion(num1, num2):
    print("Es una permutación.")
else:
    print("No es una permutación.")
