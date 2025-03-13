N = int(input("Ingrese un número: "))

log = 0
while N > 1:
    N //= 2
    log += 1

print("El logaritmo en base 2 es:", log)
