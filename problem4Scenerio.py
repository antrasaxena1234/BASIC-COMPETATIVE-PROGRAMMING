n = int(input()) 
count=0
for i in range (n):
    marks, attendance = map(int,input().split())
    if marks >=75 and attendance>=80:
        count+=1
        print(count)






