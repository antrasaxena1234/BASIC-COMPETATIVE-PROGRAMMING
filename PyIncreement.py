def increement_array(arr,inc):
    return [x + inc for x in arr]
arr=[1,2,3,4,5]
inc = 3
new_arr = increement_array(arr, inc)
print(new_arr)