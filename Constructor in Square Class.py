from os import *

from sys import *

from collections import *

from math import *

class Square:

    def __init__(self,length=10): #default contructor passed with parameter as length =10

        self.length= length

    def printArea(self):

        print(self.length**2)
