N = int(input("Ingrese la cantidad de números: "))
contador_primos = 0

for _ in range(N):
    num = int(input("Ingrese un número: "))
    
    if num > 1:
        es_primo = True
        for j in range(2, num):
            if num % j == 0:
                es_primo = False
                break
        if es_primo:
            contador_primos += 1

print("Cantidad de números primos en la lista:", contador_primos)
