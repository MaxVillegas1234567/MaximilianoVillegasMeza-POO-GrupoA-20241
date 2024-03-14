class Banco:
    def __init__(self):
        self.cuentas_bancarias = []

    def agregar_cuenta(self, cuenta):
        self.cuentas_bancarias.append(cuenta)

    def listar_cuentas(self):
        for cuenta in self.cuentas_bancarias:
            print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
            print("Saldo:", cuenta.get_saldo())
            print()

    def mostrar_cuenta(self, tipo_cuenta):
        for cuenta in self.cuentas_bancarias:
            if cuenta.get_tipo_cuenta() == tipo_cuenta:
                print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
                print("Saldo:", cuenta.get_saldo())
                return
        print("No se encontro ninguna cuenta con el tipo especificado.")
