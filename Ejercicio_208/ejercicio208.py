N = int(input("Ingrese un número: "))

raiz = int(N ** 0.5)

if raiz * raiz == N:
    print("El número es una raíz perfecta.")
else:
    print("El número no es una raíz perfecta.")
