def suma_numeros(n):
    if n < 1:
        return "El número debe ser mayor o igual a 1."
    return (n * (n + 1)) // 2

n = int(input("Ingrese un número entero positivo: "))

resultado = suma_numeros(n)
print(f"La suma de los números enteros de 1 hasta {n} es: {resultado}" if isinstance(resultado, int) else resultado)
