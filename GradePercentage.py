percentage = float(input("Enter your percentage: "))
if percentage < 0 or percentage > 100:
    print("Invalid percentage! Please enter a value between 0 and 100.")
elif percentage < 25:
    grade = "D"
elif percentage < 45:
    grade = "C"
elif percentage < 65:
    grade = "B"
elif percentage <=85:
    grade = "A"

else:
    print("Grade: A+")
