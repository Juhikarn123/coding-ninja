def find_last_occurrence(arr, element):
    index = -1
    for i in range(len(arr) - 1, -1, -1):
        if arr[i] == element:
            index = i
            break
    return index

# Get input from the user
n = int(input())
arr = list(map(int, input().split()))

search_element = int(input())

# Find the last occurrence index
last_occurrence_index = find_last_occurrence(arr, search_element)
print(last_occurrence_index)
