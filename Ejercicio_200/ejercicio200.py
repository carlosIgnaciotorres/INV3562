def sumar_hasta_una_cifra(n):
    while n >= 10:
        n = sum(int(digito) for digito in str(n))
    return n

N = int(input("Ingrese un número: "))
print("Suma de los dígitos hasta una cifra:", sumar_hasta_una_cifra(N))
