Algoritmo ControlDeInventario
    Definir articulo Como Caracter
    Definir stock, opcion, cantidad Como Entero
	
    Escribir "Ingresa el nombre del artículo:"
    Leer articulo
    Escribir "Ingresa la cantidad inicial de stock:"
    Leer stock
	
    Repetir
        Escribir "Opciones:"
        Escribir "1. Registrar venta"
        Escribir "2. Registrar compra"
        Escribir "3. Salir"
        Leer opcion
		
        Segun opcion Hacer
            1:
                Escribir "Ingresa la cantidad vendida:"
                Leer cantidad
                Si cantidad <= stock Entonces
                    stock <- stock - cantidad
                Sino
                    Escribir "No hay suficiente stock."
                FinSi
            2:
                Escribir "Ingresa la cantidad comprada:"
                Leer cantidad
                stock <- stock + cantidad
            3:
                Escribir "Saliendo del sistema."
        FinSegun
		
        Escribir "Stock actual de", articulo, ": ", stock
    Hasta Que opcion == 3
FinAlgoritmo
