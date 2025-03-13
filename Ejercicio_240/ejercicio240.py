def luhn_check(number: str) -> bool:
    total = 0
    reverse_digits = number[::-1]
    
    for i, digit in enumerate(reverse_digits):
        n = int(digit)
        if i % 2 == 1:  
            n *= 2
            if n > 9:  
                n -= 9
        total += n
    
    return total % 10 == 0


number = input("Ingrese el número de tarjeta: ")
if luhn_check(number):
    print("Número válido según el algoritmo de Luhn.")
else:
    print("Número inválido según el algoritmo de Luhn.")
