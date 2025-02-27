num1_programacion = float(input("Introduce la nota de Programación del Estudiante 1: "))
num1_matematicas = float(input("Introduce la nota de Matemáticas del Estudiante 1: "))
num2_programacion = float(input("Introduce la nota de Programación del Estudiante 2: "))
num2_matematicas = float(input("Introduce la nota de Matemáticas del Estudiante 2: "))
num3_programacion = float(input("Introduce la nota de Programación del Estudiante 3: "))
num3_matematicas = float(input("Introduce la nota de Matemáticas del Estudiante 3: "))

promedio1 = (num1_programacion + num1_matematicas) / 2
promedio2 = (num2_programacion + num2_matematicas) / 2
promedio3 = (num3_programacion + num3_matematicas) / 2

if promedio1 >= 7.5:
    print("Estudiante 1: Aprobado con promedio", promedio1)
else:
    print("Estudiante 1: No Aprobado con promedio", promedio1)

if promedio2 >= 7.5:
    print("Estudiante 2: Aprobado con promedio", promedio2)
else:
    print("Estudiante 2: No Aprobado con promedio", promedio2)

if promedio3 >= 7.5:
    print("Estudiante 3: Aprobado con promedio", promedio3)
else:
    print("Estudiante 3: No Aprobado con promedio", promedio3)
