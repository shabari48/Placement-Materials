n=int(input())
mat=[]
for i in range(n):
    mat.append(list(map(int,input().split())))
    
dp=[[0]*n]*n
ans=0
for i in range(n):
    for j in range(n):
        if i==0 or j==0:
            dp[i][j]=mat[i][j]
        elif mat[i][j]==0:
            dp[i][j]=0
        else:
            dp[i][j]=min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])+1
        
        ans=max(ans,dp[i][j])

print(ans*ans)