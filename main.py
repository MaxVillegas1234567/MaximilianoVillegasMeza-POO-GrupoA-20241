class Libreria:
    def __init__(self):
        self.usuarios = {}
        self.libros = {}
        self.libros_rentados = {}

    def registrar_usuario(self, nombre):
        id_usuario = len(self.usuarios) + 1
        self.usuarios[id_usuario] = nombre
        print("Usuario registrado correctamente.")

    def registrar_libro(self, nombre, autor):
        id_libro = len(self.libros) + 1
        self.libros[id_libro] = {"nombre": nombre, "autor": autor}
        print("Libro registrado correctamente.")

    def rentar_libro(self, id_usuario, id_libro):
        if id_usuario in self.usuarios and id_libro in self.libros:
            self.libros_rentados[id_usuario] = self.libros.get(id_libro)
            print("Libro rentado correctamente.")
        else:
            print("Usuario o libro no encontrado.")

    def listar_usuarios(self):
        print("Usuarios registrados:")
        for id_usuario, nombre in self.usuarios.items():
            print(f"ID: {id_usuario}, Nombre: {nombre}")

    def listar_libros(self):
        print("Libros registrados:")
        for id_libro, libro in self.libros.items():
            print(f"ID: {id_libro}, Nombre: {libro['nombre']}, Autor: {libro['autor']}")

    def listar_usuarios_con_libros(self):
        print("Usuarios con libros rentados:")
        for id_usuario, libro in self.libros_rentados.items():
            print(f"ID Usuario: {id_usuario}, Nombre: {self.usuarios[id_usuario]}, Libro: {libro['nombre']}")

    def listar_libros_no_rentados(self):
        print("Libros no rentados:")
        for id_libro, libro in self.libros.items():
            if id_libro not in self.libros_rentados:
                print(f"ID: {id_libro}, Nombre: {libro['nombre']}, Autor: {libro['autor']}")

    def listar_libros_rentados(self):
        print("Libros rentados:")
        for id_usuario, libro in self.libros_rentados.items():
            print(f"ID Usuario: {id_usuario}, Nombre: {self.usuarios[id_usuario]}, Libro: {libro['nombre']}")


if __name__ == "__main__":
    libreria = Libreria()

    while True:
        print("\n***MENU ***")
        print("1. Registrar usuario")
        print("2. Registrar libro")
        print("3. Rentar libro")
        print("4. Listar usuarios registrados")
        print("5. Listar libros registrados")
        print("6. Listar usuarios con libros rentados")
        print("7. Listar libros no rentados")
        print("8. Listar libros rentados")
        print("9. Salir")

        opcion = int(input("Ingrese la opcion: "))

        if opcion == 1:
            nombre_usuario = input("Ingrese el nombre del usuario: ")
            libreria.registrar_usuario(nombre_usuario)
        elif opcion == 2:
            nombre_libro = input("Ingrese el nombre del libro: ")
            autor_libro = input("Ingrese el autor del libro: ")
            libreria.registrar_libro(nombre_libro, autor_libro)
        elif opcion == 3:
            id_usuario = int(input("Ingrese el ID del usuario: "))
            id_libro = int(input("Ingrese el ID del libro: "))
            libreria.rentar_libro(id_usuario, id_libro)
        elif opcion == 4:
            libreria.listar_usuarios()
        elif opcion == 5:
            libreria.listar_libros()
        elif opcion == 6:
            libreria.listar_usuarios_con_libros()
        elif opcion == 7:
            libreria.listar_libros_no_rentados()
        elif opcion == 8:
            libreria.listar_libros_rentados()
        elif opcion == 9:
            print("Saliendo del menu")
            break
        else:
            print("Opcion no valida.")


