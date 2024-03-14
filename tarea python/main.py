class Empleado:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cuentas = []

    def agregar_cuenta(self, cuenta):
        self.cuentas.append(cuenta)

    def get_nombre(self):
        return self.nombre

    def get_cuentas(self):
        return self.cuentas


class CuentaBancaria:
    def __init__(self, tipo_cuenta, saldo):
        self.tipo_cuenta = tipo_cuenta
        self.saldo = saldo

    def get_tipo_cuenta(self):
        return self.tipo_cuenta

    def get_saldo(self):
        return self.saldo


def main():
    empleados = []

    while True:
        print("1. Agregar empleado")
        print("2. Agregar cuenta bancaria a un empleado")
        print("3. Mostrar información de todos los usuarios")
        print("4. Mostrar información de un usuario en especifico")
        print("5. Salir")
        opcion = int(input("Seleccione una opcion: "))

        if opcion == 1:
            nombre_empleado = input("Ingrese el nombre del empleado: ")
            empleado = Empleado(nombre_empleado)
            empleados.append(empleado)
            print("Empleado agregado correctamente")

        elif opcion == 2:
            nombre_empleado_cuenta = input("Ingrese el nombre del empleado: ")
            empleado_cuenta = None
            for emp in empleados:
                if emp.get_nombre() == nombre_empleado_cuenta:
                    empleado_cuenta = emp
                    break
            if empleado_cuenta is not None:
                tipo_cuenta = input("Ingrese el tipo de cuenta (A, B o C): ")
                saldo_inicial = float(input("Ingrese el saldo inicial: "))
                cuenta = CuentaBancaria(tipo_cuenta, saldo_inicial)
                empleado_cuenta.agregar_cuenta(cuenta)
                print("Cuenta bancaria agregada correctamente")
            else:
                print("Empleado no encontrado")

        elif opcion == 3:
            for emp in empleados:
                print("Nombre del empleado:", emp.get_nombre())
                cuentas = emp.get_cuentas()
                for cuenta in cuentas:
                    print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
                    print("Saldo:", cuenta.get_saldo())

        elif opcion == 4:
            nombre_empleado_info = input("Ingrese el nombre del empleado: ")
            for emp in empleados:
                if emp.get_nombre() == nombre_empleado_info:
                    print("Nombre del empleado:", emp.get_nombre())
                    cuentas = emp.get_cuentas()
                    for cuenta in cuentas:
                        print("Tipo de cuenta:", cuenta.get_tipo_cuenta())
                        print("Saldo:", cuenta.get_saldo())
                    break

        elif opcion == 5:
            print("Saliendo del Menu")
            break

        else:
            print("Opcion no valida")


