class Usuario:
    nextId = 1

    def __init__(self, nombre):
        self.id = Usuario.nextId
        Usuario.nextId += 1
        self.nombre = nombre
        self.libros_rentados = []

    def get_id(self):
        return self.id

    def get_nombre(self):
        return self.nombre

    def get_libros_rentados(self):
        return self.libros_rentados

    def rentar_libro(self, libro):
        self.libros_rentados.append(libro)


class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor


usuario = Usuario("Juan")
libro1 = Libro("El señor de los anillos", "J.R.R. Tolkien")
libro2 = Libro("Harry Potter y la piedra filosofal", "J.K. Rowling")

usuario.rentar_libro(libro1)
usuario.rentar_libro(libro2)

print("Nombre del usuario:", usuario.get_nombre())
print("ID del usuario:", usuario.get_id())
print("Libros rentados por el usuario:")
for libro in usuario.get_libros_rentados():
    print("- Título:", libro.titulo, ", Autor:", libro.autor)
