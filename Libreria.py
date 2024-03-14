class Usuario:
    def __init__(self, nombre):
        self.id = id(self)
        self.nombre = nombre
        self.libros_rentados = []

    def rentar_libro(self, libro):
        self.libros_rentados.append(libro)

    def __str__(self):
        return self.nombre


class Libro:
    def __init__(self, nombre, autor):
        self.id = id(self)
        self.nombre = nombre
        self.autor = autor
        self.rentado = False

    def set_rentado(self, rentado):
        self.rentado = rentado

    def __str__(self):
        return f"{self.nombre} - {self.autor}"


class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrar_usuario(self, nombre):
        usuario = Usuario(nombre)
        self.usuarios.append(usuario)

    def registrar_libro(self, nombre, autor):
        libro = Libro(nombre, autor)
        self.libros.append(libro)

    def rentar_libro(self, id_usuario, id_libro):
        usuario = self.buscar_usuario_por_id(id_usuario)
        libro = self.buscar_libro_por_id(id_libro)

        if usuario and libro and not libro.rentado:
            usuario.rentar_libro(libro)
            libro.set_rentado(True)
            print("El libro se rento con exito.")
        else:
            print("No se pudo rentar el libro.")

    def listar_usuarios(self):
        print("*** USUARIOS REGISTRADOS ***")
        for usuario in self.usuarios:
            print(usuario)

    def listar_libros(self):
        print("*** LIBROS REGISTRADOS ***")
        for libro in self.libros:
            print(libro)

    def listar_usuarios_con_libros(self):
        print("*** USUARIOS CON LIBROS RENTADOS ***")
        for usuario in self.usuarios:
            if usuario.libros_rentados:
                print(usuario)

    def listar_libros_no_rentados(self):
        print("*** LIBROS NO RENTADOS ***")
        for libro in self.libros:
            if not libro.rentado:
                print(libro)

    def listar_libros_rentados(self):
        print("*** LIBROS RENTADOS ***")
        for libro in self.libros:
            if libro.rentado:
                print(libro)

    def buscar_usuario_por_id(self, id):
        for usuario in self.usuarios:
            if usuario.id == id:
                return usuario
        return None

    def buscar_libro_por_id(self, id):
        for libro in self.libros:
            if libro.id == id:
                return libro
        return None