Algoritmo DatosPersona
    
    Definir nombre, sexo Como Caracter
    Definir edad Como Entero
	
   
    Escribir "Ingrese su nombre: "
    Leer nombre
	
   
    Escribir "Ingrese su edad: "
    Leer edad
	
    
    Escribir "Ingrese su sexo (masculino/femenino): "
    Leer sexo
	
 
    Segun sexo Hacer
        Caso "masculino":
            Si edad >= 18 Entonces
                Escribir "El nombre de la persona es: ", nombre
            Sino
                Escribir "La persona no cumple con los criterios."
            FinSi
        Caso "femenino":
            Escribir "La persona no cumple con los criterios."
        Caso Otro:
            Escribir "Sexo no válido."
    FinSegun
FinAlgoritmo
