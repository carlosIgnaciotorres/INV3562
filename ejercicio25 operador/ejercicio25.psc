Proceso OperacionMatematica
    Definir Numero1, Numero2, Resultado Como Real
    Definir Operador Como Caracter
	
    Escribir "Ingrese el primer n�mero: "
    Leer Numero1
    Escribir "Ingrese el segundo n�mero: "
    Leer Numero2
    Escribir "Ingrese el operador (+, -, *, /): "
    Leer Operador
	
    Si Operador = "+" Entonces
        Resultado = Numero1 + Numero2
    Sino
        Si Operador = "-" Entonces
            Resultado = Numero1 - Numero2
        Sino
            Si Operador = "*" Entonces
                Resultado = Numero1 * Numero2
            Sino
                Si Operador = "/" Entonces
                    Resultado = Numero1 / Numero2
                Sino
                    Escribir "Operador inv�lido"
                FinSi
            FinSi
        FinSi
    FinSi
	
    Escribir "El resultado es: ", Resultado
FinProceso
