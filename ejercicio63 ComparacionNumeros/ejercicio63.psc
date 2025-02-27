Algoritmo CompararNumeros
	Definir num1, num2 Como Entero;
	Escribir "Ingrese el primer número:";
	Leer num1;
	Escribir "Ingrese el segundo número:";
	Leer num2;
	
	Si num1 > num2 Entonces
		Escribir "El número ", num1, " es mayor que ", num2;
	SiNo
		Si num1 < num2 Entonces
			Escribir "El número ", num1, " es menor que ", num2;
		SiNo
			Escribir "Ambos números son iguales.";
		FinSi
	FinSi
FinAlgoritmo
