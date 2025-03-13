varones = int(input("Ingresa la cantidad de varones: "))
mujeres = int(input("Ingresa la cantidad de mujeres: "))
total = varones + mujeres
porcentaje_varones = (varones / total) * 100
porcentaje_mujeres = (mujeres / total) * 100
print(f"Porcentaje de varones: {porcentaje_varones:.2f}%")
print(f"Porcentaje de mujeres: {porcentaje_mujeres:.2f}%")
