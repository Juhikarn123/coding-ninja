class Person:

    def __init__(self, name, age):

        self.name = name

        self.age = age

    

    def display(self):

        print("The name of the person is {} and the age is {}.".format(self.name,self.age))

 

#Driver code goes here.

name = input()

age = int(input())

p = Person(name, age)

p.display()

 
