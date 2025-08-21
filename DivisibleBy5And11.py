angle1 = float(input("Enter first angle: "))
angle2 = float(input("Enter second angle: "))
angle3 = float(input("Enter third angle: "))
if angle1 + angle2 + angle3 == 180 and angle1 > 0 and angle2 > 0 and angle3 > 0:
    
    if angle1 == 90 or angle2 == 90 or angle3 == 90:
        print("Right triangle")
    elif angle1 > 90 or angle2 > 90 or angle3 > 90:
        print("Obtuse triangle")
    else:
        print("Acute triangle")
else:
    print("The angles do not form a valid triangle.")