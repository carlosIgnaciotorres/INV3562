
nombre = input("Ingrese su nombre: ")


edad = int(input("Ingrese su edad: "))


sexo = input("Ingrese su sexo (masculino/femenino): ")


if sexo.lower() == "masculino" and edad >= 18:
    print(f"El nombre de la persona es: {nombre}")
else:
    print("La persona no cumple con los criterios.")
