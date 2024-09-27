n=int(input())

for i in range(n+1):
    print(n,end="")
    
print()

for i in range(1,n+1):
  for j in range(n+1):
    if j==n-1: print(i,end="")  
    else: print(n+i,end="")
  print()
    
    
    
for i in range(n+1):
    print(n,end="")