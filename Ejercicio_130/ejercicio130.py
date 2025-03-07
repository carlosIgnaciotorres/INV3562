turno = 0
continuar = 's'

while continuar == 's':
    turno += 1
    print(f"Tu número de turno es: {turno}")
    continuar = input("¿Deseas continuar asignando turnos? (s/n): ")
