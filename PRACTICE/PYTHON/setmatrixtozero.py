


matrix=[[4,1,2,3,0],[3,1,4,0,5],[1,2,4,5,6]]

m=len(matrix)
n=len(matrix[0])
print(matrix)
var=1

for i in range(m):
    for j in range(n): 
        if matrix[i][j]==0:
            matrix[i][0]=0
            if j!=0:
                matrix[0][j]=0
            else:
                var=0

for i in range(1,m):
    for j in range(1,n):
        if matrix[i][0]==0 or matrix[0][j]==0:
            matrix[i][j]=0
            
if matrix[0][0]==0:
    for i in range(n):
        matrix[0][i]=0
        
if var==0:
    for i in range(m):
        matrix[i][0]=0
         
    

print(matrix)