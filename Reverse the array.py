def reverse_elements(elements):
    reversed_elements = elements[::-1]
    return reversed_elements

# Take input for the number of elements
n = int(input())

# Take input for the elements separated by spaces
elements_str = input()

# Split the input string into individual elements
elements = elements_str.split()

# Reverse the elements
reversed_elements = reverse_elements(elements)

# Print the reversed elements
for i in range(n):
    print(reversed_elements[i], end=" ")
