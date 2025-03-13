def pertenece_fibonacci(num):
    a, b = 0, 1
    
    if num == 0 or num == 1:
        print(f"{num} pertenece a la secuencia de Fibonacci.")
        return
    
    c = a + b
    while c < num:
        a, b = b, c
        c = a + b
    
    if c == num:
        print(f"{num} pertenece a la secuencia de Fibonacci.")
    else:
        print(f"{num} no pertenece a la secuencia de Fibonacci.")

num = int(input("Ingrese un número: "))
pertenece_fibonacci(num)
