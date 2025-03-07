calificaciones = [85, 90, 78]
suma = 0

for calificacion in calificaciones:
    suma += calificacion

promedio = suma / len(calificaciones)

if promedio > 70:
    resultado = "Aprobado"
else:
    resultado = "Reprobado"

print("El promedio es:", promedio)
print("Resultado:", resultado)