numero = int(input("Ingresa un número: "))

es_par = (numero % 2 == 0)
es_multiplo_de_5 = (numero % 5 == 0)

if es_par:
    print("El número es par")
else:
    print("El número es impar")

if es_multiplo_de_5:
    print("El número es múltiplo de 5")
else:
    print("El número no es múltiplo de 5")