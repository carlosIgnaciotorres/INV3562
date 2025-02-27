Algoritmo CalcularIMC
    Escribir "Ingresa tu peso en kilogramos (kg): "
    Leer Peso
    Escribir "Ingresa tu altura en metros (m): "
    Leer Altura
    IMC <- Peso / (Altura ^ 2)
    Si IMC < 18.5 Entonces
        Estado <- "Bajo peso"
    SiNo
        Si IMC <= 24.9 Entonces
            Estado <- "Peso normal"
        SiNo
            Si IMC <= 29.9 Entonces
                Estado <- "Sobrepeso"
            SiNo
                Estado <- "Obesidad"
            FinSi
        FinSi
    FinSi
    Escribir "Tu IMC es: ", IMC
    Escribir "Tu estado es: ", Estado
FinAlgoritmo
