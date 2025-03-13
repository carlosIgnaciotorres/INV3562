billetes1000 = int(input("Ingrese la cantidad de billetes de $1000: "))
billetes500 = int(input("Ingrese la cantidad de billetes de $500: "))
billetes200 = int(input("Ingrese la cantidad de billetes de $200: "))
billetes100 = int(input("Ingrese la cantidad de billetes de $100: "))
billetes50 = int(input("Ingrese la cantidad de billetes de $50: "))
billetes20 = int(input("Ingrese la cantidad de billetes de $20: "))
billetes10 = int(input("Ingrese la cantidad de billetes de $10: "))
monedas5 = int(input("Ingrese la cantidad de monedas de $5: "))
monedas2 = int(input("Ingrese la cantidad de monedas de $2: "))
monedas1 = int(input("Ingrese la cantidad de monedas de $1: "))

total = (
    billetes1000 * 1000 +
    billetes500 * 500 +
    billetes200 * 200 +
    billetes100 * 100 +
    billetes50 * 50 +
    billetes20 * 20 +
    billetes10 * 10 +
    monedas5 * 5 +
    monedas2 * 2 +
    monedas1 * 1
)

print(f"El total de dinero en la caja es: ${total}")