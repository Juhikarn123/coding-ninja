from os import *
from sys import *
from collections import *
from math import *

from sys import stdin



sentence = input()
words = sentence.split()

reversed_words = [word[::-1] for word in words]
reversed_sentence = ' '.join(reversed_words)

print(reversed_sentence)
