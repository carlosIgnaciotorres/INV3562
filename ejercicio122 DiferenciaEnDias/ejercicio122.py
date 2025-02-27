def convertir_a_dias(dia, mes, anio):
    dias_totales = anio * 365 + (mes - 1) * 30 + dia
    return dias_totales

dia1 = int(input("Ingrese el día de la primera fecha: "))
mes1 = int(input("Ingrese el mes de la primera fecha: "))
anio1 = int(input("Ingrese el año de la primera fecha: "))

dia2 = int(input("Ingrese el día de la segunda fecha: "))
mes2 = int(input("Ingrese el mes de la segunda fecha: "))
anio2 = int(input("Ingrese el año de la segunda fecha: "))

dias1 = convertir_a_dias(dia1, mes1, anio1)
dias2 = convertir_a_dias(dia2, mes2, anio2)

diferencia = abs(dias2 - dias1)

print("La diferencia en días entre las dos fechas es:", diferencia)
