def calcular_salario(horas_trabajadas, valor_por_hora):
    salario = horas_trabajadas * valor_por_hora
    return salario


horas_trabajadas = float(input("Ingrese el número de horas trabajadas: "))
valor_por_hora = float(input("Ingrese el valor por hora: "))


salario = calcular_salario(horas_trabajadas, valor_por_hora)


print(f"El salario total es: {salario:.2f}")
