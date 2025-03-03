Algoritmo NumeroALetras
    Definir num Como Entero
    Definir letras Como Cadena
	
    Escribir "Ingrese un número entre 0 y 9: "
    Leer num
	
    Si num >= 0 Y num <= 9 Entonces
        Si num = 0 Entonces
            letras <- "cero"
        Sino
            Si num = 1 Entonces
                letras <- "uno"
            Sino
                Si num = 2 Entonces
                    letras <- "dos"
                Sino
                    Si num = 3 Entonces
                        letras <- "tres"
                    Sino
                        Si num = 4 Entonces
                            letras <- "cuatro"
                        Sino
                            Si num = 5 Entonces
                                letras <- "cinco"
                            Sino
                                Si num = 6 Entonces
                                    letras <- "seis"
                                Sino
                                    Si num = 7 Entonces
                                        letras <- "siete"
                                    Sino
                                        Si num = 8 Entonces
                                            letras <- "ocho"
                                        Sino
                                            Si num = 9 Entonces
                                                letras <- "nueve"
                                            FinSi
                                        FinSi
                                    FinSi
                                FinSi
                            FinSi
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
        Escribir "El número en letras es: ", letras
    Sino
        Escribir "El número está fuera del rango permitido"
    FinSi
FinAlgoritmo

