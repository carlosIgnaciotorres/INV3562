Algoritmo SumaIgualANumero
    Definir a, b, c Como Real
    
    Escribir "Ingrese el valor de a: "
    Leer a
    
    Escribir "Ingrese el valor de b: "
    Leer b
    
    Escribir "Ingrese el valor de c: "
    Leer c
    
    Si a + b = c Entonces
        Escribir "La suma de a + b es igual a c"
    Sino
        Si a + c = b Entonces
            Escribir "La suma de a + c es igual a b"
        Sino
            Si b + c = a Entonces
                Escribir "La suma de b + c es igual a a"
            Sino
                Escribir "Ninguna suma es igual a otro número"
            FinSi
        FinSi
    FinSi
FinAlgoritmo
