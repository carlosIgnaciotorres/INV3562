from collections import Counter

N = int(input("Ingrese la cantidad de calificaciones: "))
calificaciones = [int(input("Ingrese una calificación: ")) for _ in range(N)]

frecuencia = Counter(calificaciones)
moda = max(frecuencia, key=frecuencia.get)

print("La moda es:", moda)
print("Distribución de calificaciones:")
for calificacion, cantidad in frecuencia.items():
    print(f"Calificación {calificacion} aparece {cantidad} veces.")
