n=int(input())
list1=list(map(int,input().split()))
k=int(input())

for i in range(n-k+1):
    sum=0
    for j in range(k):
        sum+=list1[i+j]
    print(sum,end=" ")
    i+=k

