"""
Sum of Even Numbers till N
Easy
0/40
Share
125 upvotes
Problem Statement
Detailed explanation ( Input/output format, Notes, Constraints, Images )
Sample Input 1 :
 6
Sample Output 1 :
12
Explanation Of Sample Input 1:
The even numbers from 1 to 6 are: 2, 4, 6, So adding these 3 numbers give a sum of 12.

"""
code:-
n=int(input())
sum=0
for i in range(1,n+1):
    if(i%2==0):
        sum=sum+i
print(sum)


