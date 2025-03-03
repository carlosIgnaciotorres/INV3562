Algoritmo VerificarClave
    Definir clave_establecida, clave_usuario Como Cadena
	
    clave_establecida <- "miClaveSecreta"
    
    Escribir "Introduce la clave de acceso: "
    Leer clave_usuario
    
    Si clave_usuario == clave_establecida Entonces
        Escribir "Acceso concedido."
    Sino
        Escribir "Clave incorrecta."
    Fin Si
FinAlgoritmo
