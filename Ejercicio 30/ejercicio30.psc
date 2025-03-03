Proceso CalcularHipotenusa
    Definir Cateto1, Cateto2, Hipotenusa Como Real
    Definir Cuadrado1, Cuadrado2, SumaCuadrados Como Real
	
    Escribir "Ingrese el valor del primer cateto: "
    Leer Cateto1
    Escribir "Ingrese el valor del segundo cateto: "
    Leer Cateto2
	
    Cuadrado1 = Cateto1 * Cateto1
    Cuadrado2 = Cateto2 * Cateto2
    SumaCuadrados = Cuadrado1 + Cuadrado2
    Hipotenusa = raiz(SumaCuadrados)
	
    Escribir "La hipotenusa del triángulo es: "
    Escribir Hipotenusa
FinProceso
