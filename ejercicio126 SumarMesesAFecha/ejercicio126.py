def es_bisiesto(anio):
    return (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0)

def dias_en_mes(mes, anio):
    if mes == 2:
        return 29 if es_bisiesto(anio) else 28
    elif mes in [4, 6, 9, 11]:
        return 30
    else:
        return 31

dia = int(input("Ingrese el día: "))
mes = int(input("Ingrese el mes: "))
anio = int(input("Ingrese el año: "))
meses_sumar = int(input("Ingrese la cantidad de meses a sumar: "))

mes_nuevo = mes + meses_sumar
anio_nuevo = anio + (mes_nuevo - 1) // 12
mes_nuevo = ((mes_nuevo - 1) % 12) + 1

dias_mes = dias_en_mes(mes_nuevo, anio_nuevo)

dia_nuevo = min(dia, dias_mes)

print(f"Nueva fecha: {dia_nuevo}/{mes_nuevo}/{anio_nuevo}")
