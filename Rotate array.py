def rotate_array_left(arr, k):
    n = len(arr)
    k = k % n
    rotated_arr = arr[k:] + arr[:k]
    return rotated_arr
n = int(input())
elements_str = input()
arr = elements_str.split()
arr = [int(num) for num in arr]
k = int(input())
rotated_arr = rotate_array_left(arr, k)
for i in range(n):
    print(rotated_arr[i], end=" ")
