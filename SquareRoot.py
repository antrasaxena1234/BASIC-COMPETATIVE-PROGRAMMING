import math

A = int(input("Enter a number: "))
sqrt_A = math.isqrt(A)

if sqrt_A * sqrt_A == A:
    print(sqrt_A)
else:
    print(-1)
