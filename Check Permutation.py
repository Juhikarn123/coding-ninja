from os import *
from sys import *
from collections import *
from math import *


string1 = input()
string2 = input()

# Convert strings to lists and sort them
sorted_string1 = sorted(list(string1))
sorted_string2 = sorted(list(string2))

# Check if the sorted strings are equal
if sorted_string1 == sorted_string2:
    print("true")
else:
    print("false")
