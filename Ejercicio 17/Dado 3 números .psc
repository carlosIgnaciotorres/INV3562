Proceso MayorDeTresNumeros
    Definir numero1, numero2, numero3, mayor Como Real
	
    
    Escribir "Ingresa el primer número: "
    Leer numero1
	
    Escribir "Ingresa el segundo número: "
    Leer numero2
	
    Escribir "Ingresa el tercer número: "
    Leer numero3
	
    
    Si numero1 >= numero2 Y numero1 >= numero3 Entonces
        mayor = numero1
    Sino
        Si numero2 >= numero1 Y numero2 >= numero3 Entonces
            mayor = numero2
        Sino
            mayor = numero3
        FinSi
    FinSi
	
    
    Escribir "El número mayor es: ", mayor
FinProceso
