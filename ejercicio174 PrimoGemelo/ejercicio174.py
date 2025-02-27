def es_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def primo_gemelo(n):
    if es_primo(n) and es_primo(n + 2):
        print(f"{n} y {n+2} son primos gemelos.")
    else:
        print(f"{n} no es parte de un par de primos gemelos.")

n = int(input("Ingrese un número: "))
primo_gemelo(n)
