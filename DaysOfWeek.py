day_map = {
    1: "Sunday",
    2: "Monday",
    3: "Tuesday",
    4: "Wednesday",
    5: "Thursday",
    6: "Friday",
    7: "Saturday"
}


try:
    num = int(input("Enter a number from 1 to 7: "))
    if 1 <= num <= 7:
        print(f"The day is: {day_map[num]}")
    else:
        print("Invalid number! Please enter a number between 1 and 7.")
except ValueError:
    print("Invalid input! Please enter a valid integer.")
