def es_primo(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

N = int(input("Ingrese el límite N: "))
suma = sum(1 / i for i in range(2, N + 1) if es_primo(i))

print("La sumatoria de los inversos de los primos hasta N es:", suma)
