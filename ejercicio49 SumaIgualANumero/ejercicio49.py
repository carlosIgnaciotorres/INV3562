a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

if a + b == c:
    print("La suma de a + b es igual a c")
elif a + c == b:
    print("La suma de a + c es igual a b")
elif b + c == a:
    print("La suma de b + c es igual a a")
else:
    print("Ninguna suma es igual a otro número")
