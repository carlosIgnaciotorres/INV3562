Algoritmo CalculoTotalCamisas
    Definir cantidad, precio, total Como Real
	
    Escribir "Ingrese la cantidad de camisas: "
    Leer cantidad
	
    Escribir "Ingrese el precio por camisa: "
    Leer precio
	
    Si cantidad >= 3 Entonces
        total <- (cantidad * precio) * 0.80
    Sino
        total <- (cantidad * precio) * 0.90
    FinSi
	
    Escribir "El total a pagar es: ", total
FinAlgoritmo
