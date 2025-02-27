A = int(input("Ingrese el primer número (A): "))
B = int(input("Ingrese el segundo número (B): "))

if A % B == 0:
    print(f"{A} es múltiplo de {B}")
elif B % A == 0:
    print(f"{B} es múltiplo de {A}")
else:
    print("Ninguno es múltiplo del otro.")
