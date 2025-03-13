Proceso NumeroAleatorioParImpar
    Definir minimo, maximo, numero Como Entero
    
    Escribir "Ingrese el valor mínimo:"
    Leer minimo
    
    Escribir "Ingrese el valor máximo:"
    Leer maximo
    
    numero <- Aleatorio(minimo, maximo)
    
    Escribir "Número generado:", numero
    
    Si numero MOD 2 = 0 Entonces
        Escribir "El número es par."
    Sino
        Escribir "El número es impar."
    FinSi
FinProceso
