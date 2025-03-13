def es_bisiesto(anio):
    return (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0)

def dias_en_mes(mes, anio):
    if mes == 2:
        return 29 if es_bisiesto(anio) else 28
    elif mes in [4, 6, 9, 11]:
        return 30
    else:
        return 31

# Entrada de datos
dia = int(input("Ingrese el día de la fecha inicial: "))
mes = int(input("Ingrese el mes de la fecha inicial: "))
anio = int(input("Ingrese el año de la fecha inicial: "))
numero_dias = int(input("Ingrese el número de días a sumar: "))

# Sumar días
dia += numero_dias

# Ajustar la fecha
while True:
    dias_mes = dias_en_mes(mes, anio)
    if dia <= dias_mes:
        break
    dia -= dias_mes
    mes += 1
    if mes > 12:
        mes = 1
        anio += 1

# Salida
print(f"La nueva fecha es: {dia}/{mes}/{anio}")
