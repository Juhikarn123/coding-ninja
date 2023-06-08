from os import *
from sys import *
from collections import *
from math import *

#Your code goes here
def fahrenheitcelcius(s, e, w):
    while True:
        c = 0
        if s <= e:
            c = (s - 32) * 5 / 9
            print(s, int(c))
            s = s + w

        else:
            break

s = int(input())
e = int(input())
w = int(input())
fahrenheitcelcius(s, e, w)


























