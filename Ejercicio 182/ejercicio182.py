num = int(input("Ingrese un número: "))

original = num
suma = 0
num_digitos = len(str(num))

while num > 0:
    digito = num % 10
    suma += digito ** num_digitos
    num //= 10

if suma == original:
    print(f"{original} es un número de Armstrong.")
else:
    print(f"{original} no es un número de Armstrong.")
