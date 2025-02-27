Algoritmo EcuacionCuadratica
    Definir a, b, c, D, raiz_D, x1, x2 Como Real
	
    Escribir "Introduce el valor de a: "
    Leer a
    Escribir "Introduce el valor de b: "
    Leer b
    Escribir "Introduce el valor de c: "
    Leer c
	
    D <- b * b - 4 * a * c
	
    Si D >= 0 Entonces
        raiz_D <- D ^ 0.5
        x1 <- (-b + raiz_D) / (2 * a)
        x2 <- (-b - raiz_D) / (2 * a)
        Escribir "Las soluciones son: x1 = ", x1, " y x2 = ", x2
    Sino
        Escribir "No hay soluciones reales."
    Fin Si
FinAlgoritmo

