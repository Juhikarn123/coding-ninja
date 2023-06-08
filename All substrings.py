from os import *
from sys import *
from collections import *
from math import *

string = input()
for i in range(len(string)):
    for j in range(i+1, len(string)+1):
        print(string[i:j])
