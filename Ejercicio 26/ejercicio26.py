def es_primo(numero):
    if numero <= 1:
        return False
    divisor = 2
    while divisor * divisor <= numero:
        if numero % divisor == 0:
            return False
        divisor += 1
    return True

numero = int(input("Ingrese un número: "))

if es_primo(numero):
    print("El número es primo")
else:
    print("El número no es primo")
