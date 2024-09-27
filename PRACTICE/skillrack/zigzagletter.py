r,c=map(int,input().split())
mat=[]

for i in range(r):
    mat.append(list(input().split()))


result=""

for i in range(r):
     temp=mat[i]
     if i%2==0:
         result+="".join(temp)
     else:
         result+= "".join(temp[::-1])
        
print(result)
