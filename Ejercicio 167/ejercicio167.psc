Proceso CalcularLetraDNI
    Definir dni, resto Como Entero
    Definir letras Como Cadena
    letras <- "TRWAGMYFPDXBNJZSQVHLCKE"
    
    Escribir "Ingrese el número de DNI:"
    Leer dni
    
    Si dni < 0 Entonces
        Escribir "El DNI no puede ser negativo."
    Sino
        resto <- dni Mod 23
        Escribir "La letra del DNI es: ", Subcadena(letras, resto+1, resto+1)
    FinSi
FinProceso
