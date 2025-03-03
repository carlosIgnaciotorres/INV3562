promedio = float(input("Ingrese el promedio del estudiante (0-10): "))
nivel_socioeconomico = input("Ingrese el nivel socioeconómico (bajo, medio, alto): ").lower()

if promedio >= 9.0:
    beca = "beca completa"
elif 8.0 <= promedio <= 8.9:
    if nivel_socioeconomico in ["bajo", "medio"]:
        beca = "beca parcial"
    else:
        beca = "ninguna beca"
else:
    beca = "ninguna beca"

print(f"El estudiante recibe una {beca}.")