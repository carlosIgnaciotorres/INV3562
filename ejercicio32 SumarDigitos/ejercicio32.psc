Proceso SumarDigitos
    Definir Numero, Centenas, Decenas, Unidades, Suma Como Entero
	
    Escribir "Ingrese un n�mero entero positivo de 3 cifras: "
    Leer Numero
	
    Centenas = Trunc(Numero / 100)
    Decenas = Trunc((Numero % 100) / 10)
    Unidades = Numero % 10
	
    Suma = Centenas + Decenas + Unidades
	
    Escribir "La suma de los d�gitos es: ", Suma
FinProceso
