from os import *
from sys import *
from collections import *
from math import *




#Write your countBits function here.


def count_ones(n):
    binary = bin(n)[2:]  
    count = binary.count('1')  
    return count
n = int(input())
result = count_ones(n)
print(result)



        


