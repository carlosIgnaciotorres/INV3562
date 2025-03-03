Algoritmo RaizCuadradaAproximada
	Definir numero, aproximacion, precision Como Real
	Escribir "Ingrese un número: "
	Leer numero
	Si numero >= 0 Entonces
		aproximacion <- numero / 2
		precision <- 0.0001
		Mientras Abs((aproximacion * aproximacion) - numero) > precision Hacer
			aproximacion <- (aproximacion + (numero / aproximacion)) / 2
		Fin Mientras
		Escribir "La raíz cuadrada aproximada es: ", aproximacion
	SiNo
		Escribir "El número ingresado no es válido."
	Fin Si
FinAlgoritmo
