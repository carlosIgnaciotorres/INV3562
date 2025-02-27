def es_bisiesto(anio):
    return (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0)

def dias_en_mes(mes, anio):
    if mes < 1 or mes > 12:
        return 0
    if mes == 2:
        return 29 if es_bisiesto(anio) else 28
    elif mes in [4, 6, 9, 11]:
        return 30
    else:
        return 31

dia = int(input("Ingrese el día: "))
mes = int(input("Ingrese el mes: "))
anio = int(input("Ingrese el año: "))

dias_mes = dias_en_mes(mes, anio)

if dias_mes == 0:
    print("Fecha inválida: el mes debe estar entre 1 y 12.")
elif dia < 1 or dia > dias_mes:
    print("Fecha inválida: el día no existe en este mes.")
else:
    print("Fecha válida.")
