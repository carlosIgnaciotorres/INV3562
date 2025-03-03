cantidad_personas = int(input("Ingresa la cantidad de personas: "))
edades = []

for i in range(cantidad_personas):
    edad = int(input(f"Ingresa la edad de la persona {i + 1}: "))
    edades.append(edad)

promedio = sum(edades) / cantidad_personas
print("El promedio de edades es:", promedio)