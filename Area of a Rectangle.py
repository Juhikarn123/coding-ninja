class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def calculate_area(self):
        area = self.length * self.width
        return area

# Get input from the user in a single line
length, width = map(float, input().split())

# Create an instance of the Rectangle class
rectangle = Rectangle(length, width)

# Calculate the area of the rectangle using the class method
area = rectangle.calculate_area()

# Print the area
print(area)
