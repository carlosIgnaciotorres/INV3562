Proceso SegundoMayor
    Definir n, i, primero, segundo Como Entero
    Definir numeros Como Entero
    
    Escribir "Ingrese la cantidad de números:"
    Leer n
    
    Si n < 2 Entonces
        Escribir "Se necesitan al menos dos números."
    Sino
        Dimension numeros[n]
        
        Escribir "Ingrese los números:"
        Leer numeros[0]
        primero <- numeros[0]
        segundo <- -999999  
		
        Para i <- 1 Hasta n-1 Hacer
            Leer numeros[i]
            
            Si numeros[i] > primero Entonces
                segundo <- primero
                primero <- numeros[i]
            Sino 
                Si numeros[i] > segundo Y numeros[i] < primero Entonces
                    segundo <- numeros[i]
                FinSi
            FinSi
        FinPara
		
        Si segundo = -999999 Entonces
            Escribir "No hay un segundo número mayor válido."
        Sino
            Escribir "El segundo número mayor es: ", segundo
        FinSi
    FinSi
FinProceso
