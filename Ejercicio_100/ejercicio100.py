valor1 = float(input("Introduce el valor y el peso de la primera actividad: "))
peso1 = float(input())

valor2 = float(input("Introduce el valor y el peso de la segunda actividad: "))
peso2 = float(input())

valor3 = float(input("Introduce el valor y el peso de la tercera actividad: "))
peso3 = float(input())

producto1 = valor1 * peso1
producto2 = valor2 * peso2
producto3 = valor3 * peso3

suma_productos = producto1 + producto2 + producto3
suma_pesos = peso1 + peso2 + peso3

promedio_ponderado = suma_productos / suma_pesos

print("El promedio ponderado es:", promedio_ponderado)
