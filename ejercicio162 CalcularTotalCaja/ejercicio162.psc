Algoritmo CalcularTotalCaja
    Definir billetes1000, billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, monedas5, monedas2, monedas1 Como Entero
    Definir total Como Entero
	
    Escribir "Ingrese la cantidad de billetes de $1000:"
    Leer billetes1000
    Escribir "Ingrese la cantidad de billetes de $500:"
    Leer billetes500
    Escribir "Ingrese la cantidad de billetes de $200:"
    Leer billetes200
    Escribir "Ingrese la cantidad de billetes de $100:"
    Leer billetes100
    Escribir "Ingrese la cantidad de billetes de $50:"
    Leer billetes50
    Escribir "Ingrese la cantidad de billetes de $20:"
    Leer billetes20
    Escribir "Ingrese la cantidad de billetes de $10:"
    Leer billetes10
    Escribir "Ingrese la cantidad de monedas de $5:"
    Leer monedas5
    Escribir "Ingrese la cantidad de monedas de $2:"
    Leer monedas2
    Escribir "Ingrese la cantidad de monedas de $1:"
    Leer monedas1
	
    total <- (billetes1000 * 1000) + (billetes500 * 500) + (billetes200 * 200) + (billetes100 * 100) + (billetes50 * 50) + (billetes20 * 20) + (billetes10 * 10) + (monedas5 * 5) + (monedas2 * 2) + (monedas1 * 1)
	
    Escribir "El total de dinero en la caja es: $", total
FinAlgoritmo