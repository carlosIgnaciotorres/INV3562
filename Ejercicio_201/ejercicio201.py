p = int(input("Ingrese un número primo p: "))
n = (1 << p) - 1
es_primo = True

for i in range(2, int(n ** 0.5) + 1):
    if n % i == 0:
        es_primo = False
        break

if es_primo:
    print(f"{n} es un primo de Mersenne.")
else:
    print(f"{n} no es un primo de Mersenne.")
