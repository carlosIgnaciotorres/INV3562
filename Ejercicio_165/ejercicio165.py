import random
import queue
import time

class Banco:
    def __init__(self, num_cajeros, tasa_llegada, tasa_servicio, tiempo_simulacion):
        self.cola = queue.Queue()
        self.num_cajeros = num_cajeros
        self.tasa_llegada = tasa_llegada
        self.tasa_servicio = tasa_servicio
        self.tiempo_simulacion = tiempo_simulacion
        self.tiempo_actual = 0
        self.cajeros = [0] * num_cajeros
        self.clientes_atendidos = 0

    def atender_clientes(self):
        while self.tiempo_actual < self.tiempo_simulacion:
            cliente = self.tiempo_actual + random.uniform(1, self.tasa_llegada)
            self.cola.put(cliente)

            for i in range(self.num_cajeros):
                if self.cajeros[i] == 0 and not self.cola.empty():
                    cliente_atendido = self.cola.get()
                    self.cajeros[i] = self.tiempo_actual + random.uniform(1, self.tasa_servicio)

            for i in range(self.num_cajeros):
                if self.cajeros[i] <= self.tiempo_actual and self.cajeros[i] > 0:
                    self.cajeros[i] = 0
                    self.clientes_atendidos += 1

            self.tiempo_actual += 1
            time.sleep(0.5)

        print("Clientes atendidos:", self.clientes_atendidos)

num_cajeros = int(input("Ingrese el número de cajeros: "))
tasa_llegada = float(input("Ingrese el tiempo promedio entre llegadas: "))
tasa_servicio = float(input("Ingrese el tiempo promedio de atención: "))
tiempo_simulacion = float(input("Ingrese el tiempo total de simulación: "))

banco = Banco(num_cajeros, tasa_llegada, tasa_servicio, tiempo_simulacion)
banco.atender_clientes()
