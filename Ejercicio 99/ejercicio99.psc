Algoritmo RaizCuadradaAproximada
	Definir numero, aproximacion, precision Como Real
	Escribir "Ingrese un n�mero: "
	Leer numero
	Si numero >= 0 Entonces
		aproximacion <- numero / 2
		precision <- 0.0001
		Mientras Abs((aproximacion * aproximacion) - numero) > precision Hacer
			aproximacion <- (aproximacion + (numero / aproximacion)) / 2
		Fin Mientras
		Escribir "La ra�z cuadrada aproximada es: ", aproximacion
	SiNo
		Escribir "El n�mero ingresado no es v�lido."
	Fin Si
FinAlgoritmo
