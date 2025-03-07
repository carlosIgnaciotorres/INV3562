Algoritmo CalculadoraIMC
    Definir peso, altura, imc Como Real
    Definir estado Como Cadena
	
    Escribir "Ingrese su peso en kilogramos:"
    Leer peso
	
    Escribir "Ingrese su altura en metros:"
    Leer altura
	
    imc <- peso / (altura ^ 2)
	
    Si imc < 18.5 Entonces
        estado <- "Bajo peso"
    Sino
        Si imc <= 24.9 Entonces
            estado <- "Normal"
        Sino
            estado <- "Sobrepeso"
        FinSi
    FinSi
	
    Escribir "Su IMC es:", imc
    Escribir "Estado:", estado
FinAlgoritmo
