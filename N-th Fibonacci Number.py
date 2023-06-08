from os import *

from sys import *

from collections import *

from math import *

 

def fibonacciNumber(n):

    a = 0

    b = 1

    

    if n == 0:

        return a

    elif n == 1:

        return b

    else:

        for i in range(n-1):

            c = (a + b) % (10 ** 9 + 7)

            a = b

            b = c

        return c
