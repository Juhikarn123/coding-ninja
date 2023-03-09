"""
Calculate Simple Interest
Easy
0/40
Share
172 upvotes
Problem Statement
Detailed explanation ( Input/output format, Notes, Constraints, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation Of Sample Input 1:
The input is principal=2000, rate=2.2 and time=4.
So Simple interest=Principal*rate*time/100 hence 
answer is 2000*2.2*4/100=176
"""
code:-
p=int(input())
r=float(input())
t=int(input())
i=(p*r*t)/100
i=int(i)
print(i)
