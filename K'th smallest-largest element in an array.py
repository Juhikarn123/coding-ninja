from os import *

from sys import *

from collections import *

from math import *


 

def kthSmallestLargest(arr,k):

    s1=0

    l1=0

    sorted(arr)

    check =[]

    for i in arr:

        if i not in check:

            check.append(i)

    check.sort()          

    arr = check

    sma=arr[k-1:k]

    arr=arr[::-1]

    lar=arr[k-1:k]


 

    for z in sma:

        s1 = z

    for x in lar:

        l1 = x

   

    if k > len(check):

        return -1   

    

    return s1,l1

    

#Driver's code

t = int(input())


 

while t > 0:

    

    n,k = map(int,input().split())

    arr = [int(i) for i in input().split()]

    small,large = kthSmallestLargest(arr,k)

    print(large,small)

    

    t -= 1
