N = int(input("Ingrese la cantidad de números impares: "))
producto = 1

for i in range(N):
    impar = 2 * i + 1
    producto *= impar

print(f"El producto de los primeros {N} números impares es: {producto}")
