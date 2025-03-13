Algoritmo SimularPila
    Definir pila Como Entero[100]
    Definir tope Como Entero
    Definir opcion, elemento Como Entero
    tope <- 0
    
    Repetir
        Escribir "1. Apilar elemento"
        Escribir "2. Desapilar elemento"
        Escribir "3. Terminar"
        Leer opcion
        
        Segun opcion Hacer
            1:
                Si tope < 100 Entonces
                    Escribir "Introduce el elemento a apilar:"
                    Leer elemento
                    tope <- tope + 1
                    pila[tope] <- elemento
                Sino
                    Escribir "Pila llena"
                FinSi
            2:
                Si tope > 0 Entonces
                    Escribir "Elemento desapilado: ", pila[tope]
                    tope <- tope - 1
                Sino
                    Escribir "Pila vacía"
                FinSi
            3:
                Escribir "Terminando programa..."
        FinSegun
    Hasta Que opcion = 3
    
    
    Escribir "Estado final de la pila:"
    Para i<-1 Hasta tope Con Paso 1 Hacer
        Escribir pila[i]
    FinPara
FinAlgoritmo
