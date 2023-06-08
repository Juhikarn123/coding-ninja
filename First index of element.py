


#Your code goes here.




def find_first_occurrence(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1





arr = []
n = int(input())
arr = [int(n) for n in input().split()]




target = int(input())

index = find_first_occurrence(arr, target)

if index != -1:
    print(index)
else:
    print("-1")



















