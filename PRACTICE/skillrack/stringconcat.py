from itertools import groupby
n = int(input())
s = ""
for i in range(n):
    s += input()

s="".join(sorted(s))
list1=["".join(g) for k, g in groupby(s)]

sum=0
for i in list1:
    sum+=int(i)
    
print(sum)