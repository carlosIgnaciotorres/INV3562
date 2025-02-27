hombres = int(input("Ingrese la cantidad de hombres: "))
mujeres = int(input("Ingrese la cantidad de mujeres: "))
total_estudiantes = hombres + mujeres

if total_estudiantes > 0:
    porcentaje_hombres = (hombres / total_estudiantes) * 100
    porcentaje_mujeres = (mujeres / total_estudiantes) * 100
    print("Porcentaje de hombres:", porcentaje_hombres, "%")
    print("Porcentaje de mujeres:", porcentaje_mujeres, "%")
else:
    print("Error: No hay estudiantes en el grupo")
