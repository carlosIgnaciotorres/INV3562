Proceso OperacionMatematica
    Definir Numero1, Numero2, Resultado Como Real
    Definir Operador Como Caracter
	
    Escribir "Ingrese el primer número: "
    Leer Numero1
    Escribir "Ingrese el segundo número: "
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
                    Escribir "Operador inválido"
                FinSi
            FinSi
        FinSi
    FinSi
	
    Escribir "El resultado es: ", Resultado
FinProceso
