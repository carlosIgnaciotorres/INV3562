Proceso Producto_Impares
    Definir N, i, producto, impar Como Entero
    producto <- 1
	
    Escribir "Ingrese la cantidad de números impares: "
    Leer N
	
    Para i <- 0 Hasta N-1 Hacer
        impar <- 2 * i + 1
        producto <- producto * impar
    FinPara
	
    Escribir "El producto de los primeros ", N, " números impares es: ", producto
FinProceso
