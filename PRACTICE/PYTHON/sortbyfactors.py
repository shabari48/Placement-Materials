
import math
factors=dict()

def nooffactors(n):
    count=0
    sq=int(math.sqrt(n))
    if n==sq*sq:
     count+=1


    for i in range(1,int(math.sqrt(n)+1)):
     if n%i==0 and n/i!=i:
        count+=2
        
    return count

ls=[5, 11, 10, 20, 9, 16, 23]

for i in ls:
    factors[i]=nooffactors(i)

ls.sort(reverse=True,key=lambda x:factors[x])
print(ls)