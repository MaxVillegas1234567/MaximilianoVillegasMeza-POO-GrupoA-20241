class Empleado:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas = []

    def get_nombre(self):
        return self.nombre

    def agregar_cuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def get_cuentas(self):
        return self.cuentas
