num = int(input("Enter a number:"))
if num % 3 == 0 and num % 10 == 4:
    print("Divisible by 3 and last digit is 4")
else:
    print("Condition not satisfied")