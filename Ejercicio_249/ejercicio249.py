votosCandidato1 = 0
votosCandidato2 = 0
votosCandidato3 = 0

N = int(input("Ingrese la cantidad de votantes: "))

for _ in range(N):
    voto = int(input("Votación: 1) Candidato A, 2) Candidato B, 3) Candidato C: "))

    if voto == 1:
        votosCandidato1 += 1
    elif voto == 2:
        votosCandidato2 += 1
    elif voto == 3:
        votosCandidato3 += 1
    else:
        print("Voto inválido, intente de nuevo.")
        continue

print("Resultados finales:")
print(f"Candidato A: {votosCandidato1} votos")
print(f"Candidato B: {votosCandidato2} votos")
print(f"Candidato C: {votosCandidato3} votos")

if votosCandidato1 > votosCandidato2 and votosCandidato1 > votosCandidato3:
    print("El ganador es el Candidato A")
elif votosCandidato2 > votosCandidato1 and votosCandidato2 > votosCandidato3:
    print("El ganador es el Candidato B")
elif votosCandidato3 > votosCandidato1 and votosCandidato3 > votosCandidato2:
    print("El ganador es el Candidato C")
else:
    print("Hubo un empate")
