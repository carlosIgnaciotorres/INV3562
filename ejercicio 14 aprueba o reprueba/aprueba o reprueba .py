
calificacion1 = float(input("Ingresa la primera calificación: "))
calificacion2 = float(input("Ingresa la segunda calificación: "))
calificacion3 = float(input("Ingresa la tercera calificación: "))


promedio = (calificacion1 + calificacion2 + calificacion3) / 3


if promedio >= 10.5:
    print(f"El alumno aprueba con un promedio de {promedio:.2f}")
else:
    print(f"El alumno reprueba con un promedio de {promedio:.2f}")
