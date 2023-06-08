class Fraction:

    def __init__(self, num, den):
        self.numerator = num
        self.denominator = den

    def simplify(self):
        gcd1 = gcd(self.denominator, self.numerator)
        if gcd1 != 1:
            self.numerator //= gcd1
            self.denominator //= gcd1
        return self

    def add(self, other):
        d = self.denominator * other.denominator
        n = (self.numerator * other.denominator) + (self.denominator * other.numerator)
        self.numerator = n
        self.denominator = d
        return self.simplify()

    def multiply(self, other):
        self.numerator *= other.numerator
        self.denominator *= other.denominator
        return self.simplify()

    def __str__(self):
        return '{}/{}'.format(self.numerator, self.denominator)

    def Print(self):
        print(self)


n1, d1 = list(map(int, input().split()))
f1 = Fraction(n1, d1)
op_count = int(input())


for _ in range(op_count):
    oper, n2, d2 = list(map(int, input().split()))
    f2 = Fraction(n2, d2)
    if oper == 1:
        f1.add(f2)
    elif oper == 2:
        f1.multiply(f2)
    f1.Print()
