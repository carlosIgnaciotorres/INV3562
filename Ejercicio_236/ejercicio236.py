def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

N = int(input("Ingrese el valor de N: "))
contador = sum(1 for i in range(2, N - 1) if es_primo(i) and es_primo(i + 2))

print("Cantidad de números primos gemelos en el rango:", contador)
