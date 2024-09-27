
n=int(input())

temp,o,e=[],1,n-n%2
for i in range(1,n+1):
    print("-"*(n-i),*temp,sep="",end="")
    print(o if o<=n else e,end="")
    print(*temp[::-1],sep="")
    
    if o<=n:
        temp.append(o)
        o+=2
    else:
        temp.append(e)
        e-=2
        
        
