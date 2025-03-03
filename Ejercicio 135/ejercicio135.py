def calcular_media(numeros):
    return sum(numeros) / len(numeros)

def calcular_mediana(numeros):
    numeros.sort()
    n = len(numeros)
    mid = n // 2
    if n % 2 == 0:
        return (numeros[mid - 1] + numeros[mid]) / 2
    else:
        return numeros[mid]

def calcular_moda(numeros):
    from collections import Counter
    frecuencia = Counter(numeros)
    max_frec = max(frecuencia.values())
    modas = [num for num, freq in frecuencia.items() if freq == max_frec]
    return modas[0]  # Retorna la primera moda encontrada

def main():
    numeros = []
    n = int(input("Ingrese el número de elementos: "))
    for i in range(n):
        num = float(input(f"Ingrese el número {i+1}: "))
        numeros.append(num)

    print("Media:", calcular_media(numeros))
    print("Mediana:", calcular_mediana(numeros))
    print("Moda:", calcular_moda(numeros))

if __name__ == "__main__":
    main()
