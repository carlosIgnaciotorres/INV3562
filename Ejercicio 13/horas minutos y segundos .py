def calcular_segundos(horas, minutos, segundos):
    
    total_segundos = (horas * 3600) + (minutos * 60) + segundos
    return total_segundos

horas = int(input("Ingrese el número de horas: "))
minutos = int(input("Ingrese el número de minutos: "))
segundos = int(input("Ingrese el número de segundos: "))

total_segundos = calcular_segundos(horas, minutos, segundos)


print(f"La cantidad total de segundos es: {total_segundos}")
