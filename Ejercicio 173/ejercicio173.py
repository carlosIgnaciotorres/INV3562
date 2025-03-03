def diferencia_minutos(h1, m1, h2, m2):
    minutos1 = (h1 * 60) + m1
    minutos2 = (h2 * 60) + m2
    return abs(minutos2 - minutos1)

h1, m1 = map(int, input("Ingrese la primera hora (HH MM): ").split())
h2, m2 = map(int, input("Ingrese la segunda hora (HH MM): ").split())

diferencia = diferencia_minutos(h1, m1, h2, m2)
print(f"La diferencia en minutos es: {diferencia}")
