N = float(input("Ingrese un número: "))
X = N / 3
tolerancia = 0.0001

while True:
    X_nuevo = (2 * X + N / (X * X)) / 3
    if abs(X_nuevo - X) < tolerancia:
        break
    X = X_nuevo

print(f"La raíz cúbica aproximada es: {X_nuevo}")
