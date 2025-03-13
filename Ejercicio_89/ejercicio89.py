edad_hermano1 = int(input("Ingresa la edad del primer hermano: "))
edad_hermano2 = int(input("Ingresa la edad del segundo hermano: "))

if edad_hermano1 > edad_hermano2:
    mayor = edad_hermano1
    menor = edad_hermano2
else:
    mayor = edad_hermano2
    menor = edad_hermano1

diferencia = mayor - menor

print(f"El hermano mayor tiene: {mayor} años.")
print(f"La diferencia de edades es de: {diferencia} años.")
