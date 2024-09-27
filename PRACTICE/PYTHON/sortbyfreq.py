from collections import Counter

a=[9,9,9,2,5]
a.sort()

c=Counter(a)


a.sort(key=lambda x: c[x],reverse=True)

print(a)