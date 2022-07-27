class Vector:
        def __init__(self, first, second):
            self.first = first
            self.second = second
        def __add__(self, value):
            return (self.first + value.first, self.second + value.second)


if __name__ == "__main__":
        v1 = Vector(1,2)
        v2 = Vector(2,3)
        v1 + v2