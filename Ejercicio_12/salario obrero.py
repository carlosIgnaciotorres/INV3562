def calcular_nuevo_salario(salario_original, incremento_porcentaje):
    
    incremento = salario_original * (incremento_porcentaje / 100)
    
    nuevo_salario = salario_original + incremento
    return nuevo_salario


salario_original = float(input("Ingrese el salario original del obrero: "))


incremento_porcentaje = 25


nuevo_salario = calcular_nuevo_salario(salario_original, incremento_porcentaje
print(f"El nuevo salario después del incremento del {incremento_porcentaje}% es: {nuevo_salario:.2f}")
