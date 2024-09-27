n=int(input())
pascals = [[0 for i in range(n)] for j in range(n)]

for i in range(n):
    for j in range(n):
        if j==0 or j==i:
            pascals[i][j]=1
        
for i in range(2,n):
     for j in range(1,i):
        if j!=i:
         pascals[i][j]=pascals[i-1][j-1]+pascals[i-1][j]
 

for i in range(n):
   print(pascals[n-1][i],end=" ")