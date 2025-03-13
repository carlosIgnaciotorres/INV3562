Algoritmo Tienda
    Definir cantidad_productos, i Como Entero
    Definir productos Como Cadena
    Definir precios Como Real
    Definir total Como Real
    
    Escribir "Ingresa la cantidad de productos:"
    Leer cantidad_productos
    
    total = 0
    
    Para i = 1 Hasta cantidad_productos Con Paso 1 Hacer
        Escribir "Ingresa el nombre del producto ", i, ":"
        Leer productos
        Escribir "Ingresa el precio de ", productos, ":"
        Leer precios
        total = total + precios
    FinPara
    
    Escribir "El total de la compra es:", total
FinAlgoritmo