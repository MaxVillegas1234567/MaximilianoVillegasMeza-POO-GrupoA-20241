class CuentaBancaria:
    def __init__(self, tipo_cuenta, saldo_inicial):
        if tipo_cuenta in ['A', 'B', 'C']:
            self.tipo_cuenta = tipo_cuenta
        else:
            print("Tipo de cuenta no valido. Debe ser A, B o C.")
            return

        if tipo_cuenta == 'A' and saldo_inicial > 50000:
            print("El saldo inicial maximo para una cuenta tipo A es $50,000.")
            return
        elif tipo_cuenta == 'B' and saldo_inicial > 100000:
            print("El saldo inicial maximo para una cuenta tipo B es $100,000.")
            return

        self.saldo = saldo_inicial

    def depositar(self, monto):
        if monto <= 0:
            print("El monto a depositar debe ser mayor que cero.")
            return

        if self.tipo_cuenta == 'A' and self.saldo + monto > 50000:
            print("El saldo maximo para este tipo de cuenta es $50,000.")
            return
        elif self.tipo_cuenta == 'B' and self.saldo + monto > 100000:
            print("El saldo maximo para este tipo de cuenta es $100,000.")
            return

        self.saldo += monto
        print(f"Se ha depositado ${monto} en la cuenta.")

    def retirar(self, monto):
        if monto <= 0:
            print("El monto a retirar debe ser mayor que cero.")
            return

        if self.saldo - monto < 0:
            print("No hay suficiente saldo en la cuenta.")
            return

        if self.tipo_cuenta == 'A' and self.saldo - monto < 1000:
            print("El saldo minimo para este tipo de cuenta es $1,000.")
            return
        elif self.tipo_cuenta == 'B' and self.saldo - monto < 5000:
            print("El saldo minimo para este tipo de cuenta es $5,000.")
            return
        elif self.tipo_cuenta == 'C' and self.saldo - monto < 10000:
            print("El saldo minimo para este tipo de cuenta es $10,000.")
            return

        self.saldo -= monto
        print(f"Se ha retirado ${monto} de la cuenta.")

    def get_tipo_cuenta(self):
        return self.tipo_cuenta

    def get_saldo(self):
        return self.saldo
