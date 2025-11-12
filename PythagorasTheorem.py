import math
def pythagoras(a, b):
    return math.sqrt(a ** 2 + b ** 2)
a = float(input("Enter side a: "))
b = float(input("Enter side b: "))
c = pythagoras(a, b)
print("Hypotenuse is:", c)
