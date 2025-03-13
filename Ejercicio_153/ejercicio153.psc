Algoritmo PromedioEdades
    Definir cantidad_personas Como Entero
    Definir suma_edades Como Entero
    Definir promedio Como Real
    Definir i Como Entero
    
    
    Dimension edades[100]  
    
    Escribir "Ingresa la cantidad de personas:"
    Leer cantidad_personas
    
    suma_edades = 0
    
    
    Para i = 1 Hasta cantidad_personas Con Paso 1 Hacer
        Escribir "Ingresa la edad de la persona ", i, ":"
        Leer edades[i]
        suma_edades = suma_edades + edades[i]
    FinPara
    
    
    promedio = suma_edades / cantidad_personas
    
    
    Escribir "El promedio de edades es:", promedio
FinAlgoritmo