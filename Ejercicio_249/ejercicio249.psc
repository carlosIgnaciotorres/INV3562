Proceso SistemaVotacion
    Definir N, voto, votosCandidato1, votosCandidato2, votosCandidato3 Como Entero
    
    votosCandidato1 <- 0
    votosCandidato2 <- 0
    votosCandidato3 <- 0
    
    Escribir "Ingrese la cantidad de votantes:"
    Leer N
    
    Para i <- 1 Hasta N Hacer
        Escribir "Votación: 1) Candidato A, 2) Candidato B, 3) Candidato C"
        Leer voto
        
        Segun voto Hacer
            1: votosCandidato1 <- votosCandidato1 + 1
            2: votosCandidato2 <- votosCandidato2 + 1
            3: votosCandidato3 <- votosCandidato3 + 1
            De Otro Modo:
                Escribir "Voto inválido, intente de nuevo."
                i <- i - 1
        FinSegun
    FinPara
    
    Escribir "Resultados finales:"
    Escribir "Candidato A: ", votosCandidato1, " votos"
    Escribir "Candidato B: ", votosCandidato2, " votos"
    Escribir "Candidato C: ", votosCandidato3, " votos"
    
    Si votosCandidato1 > votosCandidato2 Y votosCandidato1 > votosCandidato3 Entonces
        Escribir "El ganador es el Candidato A"
    Sino 
        Si votosCandidato2 > votosCandidato1 Y votosCandidato2 > votosCandidato3 Entonces
            Escribir "El ganador es el Candidato B"
        Sino 
            Si votosCandidato3 > votosCandidato1 Y votosCandidato3 > votosCandidato2 Entonces
                Escribir "El ganador es el Candidato C"
            Sino
                Escribir "Hubo un empate"
            FinSi
        FinSi
    FinSi
FinProceso
