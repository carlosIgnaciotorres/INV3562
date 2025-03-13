import time

N = int(input("Ingrese el tiempo en segundos: "))

while N >= 0:
    print("Tiempo restante:", N, "segundos")
    time.sleep(1)
    N -= 1

print("¡Tiempo terminado!")
