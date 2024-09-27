def getmaxoddeven(n):
    res=[0,0]
    while n:
        d=n%10
        res[d%2]=max(res[d%2],d)
        n//=10
        
    return res

x,y=map(getmaxoddeven,map(int,input().split()))
print(x)
print(y)
#explain this code to me github copilot

