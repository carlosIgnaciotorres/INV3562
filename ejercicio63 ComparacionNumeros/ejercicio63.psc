Algoritmo CompararNumeros
	Definir num1, num2 Como Entero;
	Escribir "Ingrese el primer n�mero:";
	Leer num1;
	Escribir "Ingrese el segundo n�mero:";
	Leer num2;
	
	Si num1 > num2 Entonces
		Escribir "El n�mero ", num1, " es mayor que ", num2;
	SiNo
		Si num1 < num2 Entonces
			Escribir "El n�mero ", num1, " es menor que ", num2;
		SiNo
			Escribir "Ambos n�meros son iguales.";
		FinSi
	FinSi
FinAlgoritmo
