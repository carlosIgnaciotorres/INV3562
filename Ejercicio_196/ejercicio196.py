def es_feliz(n):
    visto = set()
    while n != 1 and n not in visto:
        visto.add(n)
        n = sum(int(digito) ** 2 for digito in str(n))
    return n == 1

num = int(input("Ingrese un número: "))
if es_feliz(num):
    print("El número es feliz.")
else:
    print("El número no es feliz.")
