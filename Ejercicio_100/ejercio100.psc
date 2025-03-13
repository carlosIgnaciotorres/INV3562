Algoritmo PromedioPonderado
    Definir valor1, peso1, valor2, peso2, valor3, peso3, suma_productos, suma_pesos, promedio_ponderado Como Real
	
    Escribir "Introduce el valor y el peso de la primera actividad: "
    Leer valor1, peso1
    Escribir "Introduce el valor y el peso de la segunda actividad: "
    Leer valor2, peso2
    Escribir "Introduce el valor y el peso de la tercera actividad: "
    Leer valor3, peso3
	
    producto1 <- valor1 * peso1
    producto2 <- valor2 * peso2
    producto3 <- valor3 * peso3
	
    suma_productos <- producto1 + producto2 + producto3
    suma_pesos <- peso1 + peso2 + peso3
	
    promedio_ponderado <- suma_productos / suma_pesos
	
    Escribir "El promedio ponderado es: ", promedio_ponderado
FinAlgoritmo
