from os import *
from sys import *
from collections import *
from math import *




#Write your totalPrime function here.

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def count_primes(S,E):
    count = 0
    for num in range(S, E + 1):
        if is_prime(num):
            count += 1
    return count



S,E = map(int,input().split(' '))
total_primes = count_primes(S,E)


print(total_primes)


