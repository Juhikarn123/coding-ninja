from fractions import Fraction 

class Fraction_oper:

    def __init__(self,n1,n2,d1,d2,ty):

        

        self.n1 = n1

        self.n2 = n2

        self.d1 = d1

        self.d2 = d2

        self.ty = ty

 

    def printfraction(self):

        if self.ty == 1:   

            self.add_num = (self.n1*self.d2) + (self.n2*self.d1)

            self.add_deno = self.d1*self.d2

            self.fraction_ofadd = Fraction(self.add_num,self.add_deno)

            self.simplify_1 = self.fraction_ofadd.limit_denominator()

            print(self.simplify_1)

 

            self.n1 = self.simplify_1.numerator

            self.d1 = self.simplify_1.denominator

 

        if self.ty == 2:

            self.fraction_givenval = Fraction(n2,d2)

            self.simplify_2 = Fraction(self.n1,self.d1) * self.fraction_givenval 

            self.simplify_2 = self.simplify_2.limit_denominator()

            print(self.simplify_2)

            

            self.n1 = self.simplify_2.numerator

            self.d1 = self.simplify_2.denominator

 

n1,d1 = map(int,input().split())

que = int(input())

 

#FIRST PASS 3 PARAMETERS INCLUDING SELF

 

frac_obj = Fraction_oper(n1,None,d1,None,None)

 

while(que>0):

    ty,n2,d2 = map(int,input().split())

    frac_obj.n2 = n2

    frac_obj.d2 = d2

    frac_obj.ty = ty

    frac_obj.printfraction()

    que -= 1

