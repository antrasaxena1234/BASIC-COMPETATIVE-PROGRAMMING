n=int(input())
marks=list(map(int,input().split()))
passed=0
failed=0
for i in range(len(marks)):
    if(marks[i]>=35):
        passed+=1
    else:
        failed+=1
    print(passed)
    print(failed)