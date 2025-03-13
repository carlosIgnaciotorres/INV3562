dia = int(input("Ingrese el día: "))
mes = int(input("Ingrese el mes (número del 1 al 12): "))
anio = int(input("Ingrese el año: "))

meses = ["", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]

if 1 <= mes <= 12:
    mes_letras = meses[mes]
else:
    mes_letras = "Mes inválido"

print(f"La fecha ingresada es: {dia} de {mes_letras} de {anio}")
