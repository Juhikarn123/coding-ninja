from os import *
from sys import *
from collections import *
from math import *





def remove_character(string, character):
    return string.replace(character, "")

# Example usage
input_string = input()
input_character = input()

result = remove_character(input_string, input_character)
print(result)
