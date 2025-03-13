Proceso SimulacionColaBanco
    Definir num_cajeros, tasa_llegada, tasa_servicio, tiempo_simulacion Como Entero
    Definir tiempo_actual, clientes_atendidos Como Entero
    Definir i Como Entero
    Definir cajeros Como Arreglo De Entero
    Definir cliente, cliente_atendido Como Entero
    Definir cola Como Cola
    
    Escribir "Ingrese el número de cajeros: "
    Leer num_cajeros
    Escribir "Ingrese el tiempo promedio entre llegadas (segundos): "
    Leer tasa_llegada
    Escribir "Ingrese el tiempo promedio de atención por cajero (segundos): "
    Leer tasa_servicio
    Escribir "Ingrese el tiempo total de simulación (segundos): "
    Leer tiempo_simulacion
	
    tiempo_actual <- 0
    clientes_atendidos <- 0
    Dimension cajeros[num_cajeros]
    
    Para i <- 1 Hasta num_cajeros Hacer
        cajeros[i] <- 0
    FinPara
    
    Definir cola Como Cola
    Mientras tiempo_actual < tiempo_simulacion Hacer
        cliente <- tiempo_actual + Azar(tasa_llegada) + 1
        Encolar(cola, cliente)
        
        Para i <- 1 Hasta num_cajeros Hacer
            Si cajeros[i] = 0 Y No EsVacia(cola) Entonces
                cliente_atendido <- Desencolar(cola)
                cajeros[i] <- tiempo_actual + Azar(tasa_servicio) + 1
            FinSi
        FinPara
        
        Para i <- 1 Hasta num_cajeros Hacer
            Si cajeros[i] <= tiempo_actual Y cajeros[i] > 0 Entonces
                cajeros[i] <- 0
                clientes_atendidos <- clientes_atendidos + 1
            FinSi
        FinPara
        
        tiempo_actual <- tiempo_actual + 1
        Esperar 0.5 Segundos
    FinMientras
    
    Escribir "Clientes atendidos: ", clientes_atendidos
FinProceso
