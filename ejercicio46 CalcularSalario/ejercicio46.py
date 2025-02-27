horas_trabajadas = float(input("Ingrese la cantidad de horas trabajadas: "))
valor_por_hora = float(input("Ingrese el valor de la hora: "))

salario_total = horas_trabajadas * valor_por_hora
descuento_ss = salario_total * 0.10
descuento_fondo = salario_total * 0.01

salario_neto = salario_total - descuento_ss - descuento_fondo

print("El salario neto a pagar es:", salario_neto)
