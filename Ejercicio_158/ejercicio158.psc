Algoritmo CalcularIMC
    // Definir variables
    Definir peso, altura, imc Como Real
    
    // Solicitar datos al usuario
    Escribir "Ingrese su peso en kilogramos (kg):"
    Leer peso
    
    Escribir "Ingrese su altura en metros (m):"
    Leer altura
    
    // Calcular el IMC
    imc <- peso / (altura ^ 2)
    
    // Mostrar el resultado del IMC
    Escribir "Su Índice de Masa Corporal (IMC) es: ", imc
    
    // Determinar el rango de peso
    Si imc < 18.5 Entonces
        Escribir "Usted está en el rango de BAJO PESO."
    Sino
        Si imc >= 18.5 Y imc <= 24.9 Entonces
            Escribir "Usted está en el rango de PESO NORMAL (saludable)."
        Sino
            Si imc >= 25.0 Y imc <= 29.9 Entonces
                Escribir "Usted está en el rango de SOBREPESO."
            Sino
                Escribir "Usted está en el rango de OBESIDAD."
            FinSi
        FinSi
    FinSi
FinAlgoritmo