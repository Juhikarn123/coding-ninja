#Your code goes here
n=input()
m=list(map(int,n))
evensum=0
oddsum=0
for i in range(0,len(m)):
    if m[i]%2==0:
        evensum=evensum+m[i]
    else:
        oddsum=oddsum+m[i]
print(evensum,oddsum)






















