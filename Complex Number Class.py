class ComplexNumber:
    def __init__(self, real=0, imaginary=0):
        self.real = real
        self.imaginary = imaginary

    def add(self, other):
        self.real += other.real
        self.imaginary += other.imaginary

    def multiply(self, other):
        new_real = self.real * other.real - self.imaginary * other.imaginary
        new_imaginary = self.real * other.imaginary + self.imaginary * other.real
        self.real = new_real
        self.imaginary = new_imaginary

    def print_complex(self):
        print(f"{self.real} + {self.imaginary}i")


# Get input from the user
real1, imaginary1 = map(int, input().split())
real2, imaginary2 = map(int, input().split())
choice = int(input())

# Create two complex numbers
c1 = ComplexNumber(real1, imaginary1)
c2 = ComplexNumber(real2, imaginary2)

# Perform the chosen operation
if choice == 1:
    c1.add(c2)
elif choice == 2:
    c1.multiply(c2)

# Print the complex number
c1.print_complex()
