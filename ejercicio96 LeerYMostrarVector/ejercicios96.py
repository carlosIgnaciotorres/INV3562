vector = [0] * 5
for i in range(5):
    vector[i] = int(input(f"Ingrese el valor en la posición {i + 1}: "))
print("Los valores ingresados son:")
for valor in vector:
    print(valor)
