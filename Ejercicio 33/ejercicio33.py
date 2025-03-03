
edad_hermano1 = int(input("Ingrese la edad del primer hermano: "))
edad_hermano2 = int(input("Ingrese la edad del segundo hermano: "))


if edad_hermano1 > edad_hermano2:
    diferencia = edad_hermano1 - edad_hermano2
    print("El hermano mayor tiene", edad_hermano1, "años.")
    print("La diferencia de edad es de", diferencia, "años.")
elif edad_hermano2 > edad_hermano1:
    diferencia = edad_hermano2 - edad_hermano1
    print("El hermano mayor tiene", edad_hermano2, "años.")
    print("La diferencia de edad es de", diferencia, "años.")
else:
    print("Ambos hermanos tienen la misma edad.")
