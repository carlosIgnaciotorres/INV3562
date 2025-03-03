def calcular_salario():
    horas_trabajadas = float(input("Ingrese la cantidad de horas trabajadas en el mes: "))
    valor_hora = float(input("Ingrese el valor de la hora de trabajo: "))
    
    salario_bruto = horas_trabajadas * valor_hora
    descuento_ss = salario_bruto * 0.10
    descuento_fondo = salario_bruto * 0.01
    salario_neto = salario_bruto - descuento_ss - descuento_fondo
    
    print("Salario bruto:", salario_bruto)
    print("Descuento por seguridad social (10%):", descuento_ss)
    print("Descuento por fondo de empleados (1%):", descuento_fondo)
    print("Salario neto a pagar:", salario_neto)

calcular_salario()
