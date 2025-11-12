n=int(input())
arr = list(map(int,input().split()))
passed=0
failed=0
for i in range(len(arr)):
    if arr[i]>=35:
        passed+=1
        print("passed")
    else:
        failed+=1
print(passed,failed)

