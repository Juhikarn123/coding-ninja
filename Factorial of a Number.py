#Your code goes here
def factorial(n):
    if n<0:
        return "Error"
    elif n==0:
        return 1
    else:
        return (n*factorial(n-1))

n=int(input())
print(factorial(n))


























