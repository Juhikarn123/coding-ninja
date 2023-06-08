from os import *
from sys import *
from collections import *
from math import *
def sortColors(nums):
    left, mid, right = 0, 0, len(nums) - 1

    while mid <= right:
        if nums[mid] == 0:
            nums[left], nums[mid] = nums[mid], nums[left]
            left += 1
            mid += 1
        elif nums[mid] == 1:
            mid += 1
        else:  # nums[mid] == 2
            nums[mid], nums[right] = nums[right], nums[mid]
            right -= 1

    return nums


# Read the number of test cases
t = int(input())

# Iterate through each test case
for _ in range(t):
    # Read the size of the array/list
    n = int(input())

    # Read the elements of the array/list
    nums = list(map(int, input().split()))

    # Sort the array/list
    sorted_nums = sortColors(nums)

    # Print the sorted array/list elements
    print(' '.join(map(str, sorted_nums)))
