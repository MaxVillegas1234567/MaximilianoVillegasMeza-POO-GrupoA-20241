class Libro:
    next_id = 1

    def __init__(self, nombre, autor):
        self.id = Libro.next_id
        Libro.next_id += 1
        self.nombre = nombre
        self.autor = autor
        self.rentado = False

    def get_id(self):
        return self.id

    def get_nombre(self):
        return self.nombre

    def get_autor(self):
        return self.autor

    def is_rentado(self):
        return self.rentado

    def set_rentado(self, rentado):
        self.rentado = rentado