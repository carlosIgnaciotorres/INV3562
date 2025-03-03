def main():
    n = int(input("Ingrese el número de valores: "))
    lista_valores = []

    for i in range(n):
        valor = float(input(f"Ingrese valor {i+1}: "))
        lista_valores.append(valor)

    rangos = [0, 10, 20, 30, 40, 50]
    frecuencias = [0] * (len(rangos) - 1)

    for valor in lista_valores:
        for i in range(len(rangos) - 1):
            if rangos[i] <= valor < rangos[i + 1]:
                frecuencias[i] += 1

    for i in range(len(frecuencias)):
        print(f"Rango {rangos[i]} - {rangos[i+1]}: {frecuencias[i]}")

if __name__ == "__main__":
    main()
