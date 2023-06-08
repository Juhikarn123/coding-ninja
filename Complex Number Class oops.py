from os import *

from sys import *

from collections import *

from math import *

 

class ComplexNumbers:

 

    def __init__(self,a,b,c,d,n):

        self.a = a

        self.b = b

        self.d = c

        self.d = d

        self.n = n

        self.real = 0

        self.img = 0

 

        if n==1:

            self.real = a+c

            self.img = b+d

        elif n==2:

            self.real = a*c - b*d

            self.img = a*d + b*c

        alphabet = 'i'

        self.combine = alphabet + str(self.img)

        str(self.real)

        self.makecom = ''

        self.makecom = str(self.real) + ' ' + "+" + ' ' + self.combine

  

    def printcomplex(self):

        if self.n>2:

            print()

        else :

            print(self.makecom)

  

a,b = map(int,input().split())

c,d = map(int,input().split())

n = int(input())

 

cn = ComplexNumbers(a,b,c,d,n)

cn.printcomplex()
