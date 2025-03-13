N = int(input("Ingrese un número: "))

a, b = 0, 1
fib1, fib2 = 0, 1

while b <= N:
    fib1, fib2 = a, b
    a, b = b, a + b

if (N - fib1) <= (fib2 - N):
    print("El número de Fibonacci más cercano es:", fib1)
else:
    print("El número de Fibonacci más cercano es:", fib2)
