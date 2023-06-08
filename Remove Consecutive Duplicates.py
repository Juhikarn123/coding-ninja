from os import *
from sys import *
from collections import *
from math import *

from sys import stdin
string = input()
result = ""

# Iterate through the string
for i in range(len(string)):
    # Append the current character if it is different from the previous one
    if i == 0 or string[i] != string[i-1]:
        result += string[i]

print(result)
