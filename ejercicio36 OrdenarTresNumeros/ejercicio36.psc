Proceso OrdenarTresNumeros
    Definir Numero1, Numero2, Numero3 Como Real
	
    Escribir "Ingrese el primer n�mero: "
    Leer Numero1
    Escribir "Ingrese el segundo n�mero: "
    Leer Numero2
    Escribir "Ingrese el tercer n�mero: "
    Leer Numero3
	
    Si Numero1 >= Numero2 Y Numero1 >= Numero3 Entonces
        Si Numero2 >= Numero3 Entonces
            Escribir Numero1, ", ", Numero2, ", ", Numero3
        Sino
            Escribir Numero1, ", ", Numero3, ", ", Numero2
        FinSi
    Sino
        Si Numero2 >= Numero1 Y Numero2 >= Numero3 Entonces
            Si Numero1 >= Numero3 Entonces
                Escribir Numero2, ", ", Numero1, ", ", Numero3
            Sino
                Escribir Numero2, ", ", Numero3, ", ", Numero1
            FinSi
        Sino
            Si Numero3 >= Numero1 Y Numero3 >= Numero2 Entonces
                Si Numero1 >= Numero2 Entonces
                    Escribir Numero3, ", ", Numero1, ", ", Numero2
                Sino
                    Escribir Numero3, ", ", Numero2, ", ", Numero1
                FinSi
            FinSi
        FinSi
    FinSi
FinProceso
