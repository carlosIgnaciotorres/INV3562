N = int(input("Ingrese un número: "))

if N > 0 and (N & (N - 1)) == 0:
    print("El número es una potencia de dos.")
else:
    print("El número no es una potencia de dos.")
