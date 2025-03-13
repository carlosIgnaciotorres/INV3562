Algoritmo ValidarContraseña
    Definir contraseña Como Cadena
    Definir longitud Como Entero
    Definir es_valida Como Logico
    
    Escribir "Ingresa una contraseña:"
    Leer contraseña
    
    longitud = LongitudCadena(contraseña)
    
    es_valida = (longitud >= 8)
    
    Si es_valida Entonces
        Escribir "Contraseña válida"
    Sino
        Escribir "Contraseña inválida"
    FinSi
FinAlgoritmo